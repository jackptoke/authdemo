package dev.agitek.authdemo.screens.home

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController


@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel(), navController: NavController) {
    val posts = homeViewModel.posts.observeAsState()
    val isPostLoading = homeViewModel.isLoading.observeAsState()

    LaunchedEffect(key1 = true) {
        homeViewModel.getPosts()
    }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        if(isPostLoading.value == true) CircularProgressIndicator()
        else LazyColumn(modifier = Modifier.padding(8.dp)) {
            items(posts.value?: listOf()) { post ->
                Text(text = post.title)
            }
        }
    }

}