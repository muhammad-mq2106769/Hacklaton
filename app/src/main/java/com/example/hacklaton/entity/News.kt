package com.example.hacklaton.entity

import kotlinx.serialization.Serializable

@Serializable
data class News (
   val heading : String,
   val article : String
){

}
