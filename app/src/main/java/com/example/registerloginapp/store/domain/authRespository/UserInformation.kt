package com.example.registerloginapp.store.domain.authRespository

import com.example.registerloginapp.store.data.network.Resource
import com.example.registerloginapp.store.domain.model.Student
import com.example.registerloginapp.store.domain.model.UserData

interface UserInformation {
    suspend fun getAllUsers(): Resource<List<UserData>>
//    suspend fun getAllUsers(): List<UserData>
//suspend fun getAllUsers(): Resource<UserData>
//    suspend fun createUser(student: Student): Resource<UserData>
}