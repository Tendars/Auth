package com.example.registerloginapp.store.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Student(
    val userId:Int,
    val title: String
)
