package com.example.registerloginapp.store.data

import com.example.registerloginapp.store.data.network.Resource
import com.example.registerloginapp.store.domain.authRespository.UserInformation
import com.example.registerloginapp.store.domain.model.UserData
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.*

class UserInformationImpl(
    private val httpClient: HttpClient
) : UserInformation {
    override suspend fun getAllUsers(): Resource<List<UserData>> {
        return try {
            Resource.Success(
                httpClient.get {
                    url("https://jsonplaceholder.typicode.com/albums")
                }.body()
            )
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Failure(e)
        }
    }
}