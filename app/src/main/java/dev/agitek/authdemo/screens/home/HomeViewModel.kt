package dev.agitek.authdemo.screens.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.agitek.authdemo.models.Post
import dev.agitek.authdemo.network.RetrofitInstance
import kotlinx.coroutines.launch

private const val TAG = "HomeViewModel"
class HomeViewModel: ViewModel() {
    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    private var _posts: MutableLiveData<List<Post>> = MutableLiveData()
    val posts: LiveData<List<Post>>
        get() = _posts

    fun getPosts() {
        viewModelScope.launch {
            _isLoading.value = true
            val result = RetrofitInstance.api.getPosts()

            if(result.isSuccessful) {

                _posts.value = result.body() ?: listOf<Post>()
                _isLoading.value = false

                Log.d("Debug - HomeViewModel", "getPost - Data - ${ posts.value?.count() }")
            }
        }
    }
}