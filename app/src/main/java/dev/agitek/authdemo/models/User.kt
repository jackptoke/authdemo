package dev.agitek.authdemo.models

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val phone: String,
    val website: String,
    val company: Company
    )
