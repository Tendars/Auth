package com.example.registerloginapp.store.data.network

sealed class Resource<out R> {
    data class Success<out R>(val data: R) : Resource<R>()
    data class Failure(val exception: Exception) : Resource<Nothing>()
}