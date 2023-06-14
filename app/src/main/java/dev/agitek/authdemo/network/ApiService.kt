package dev.agitek.authdemo.network

import dev.agitek.authdemo.models.LoginRequest
import dev.agitek.authdemo.models.LoginResponse
import dev.agitek.authdemo.models.Post
import dev.agitek.authdemo.models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
//    @POST("auth/login")
//    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}