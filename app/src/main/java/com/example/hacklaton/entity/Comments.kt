package com.example.hacklaton.entity

import kotlinx.serialization.Serializable

@Serializable
data class Comments(
    val commenter : String,
    val comment : String
) {
}