package dev.agitek.authdemo.repositories

import dev.agitek.authdemo.models.LoginRequest
import dev.agitek.authdemo.models.LoginResponse
import dev.agitek.authdemo.network.ApiService

class AuthRepository(private val apiService: ApiService) {
//    suspend fun login(email: String, password: String): Result<LoginResponse?> {
//        val request = LoginRequest(email, password)
//        val response = apiService.login(request)
//
//        if(response.isSuccessful) {
//
//        }
//
//    }
//
//    private fun parseErrorMessage(errorBody: String?): String {
//        return "Error $errorBody"
//    }
}