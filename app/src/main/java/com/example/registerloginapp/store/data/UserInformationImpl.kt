package com.example.registerloginapp.store.data

import android.util.Log
import com.example.registerloginapp.store.data.network.Resource
import com.example.registerloginapp.store.domain.authRespository.UserInformation
import com.example.registerloginapp.store.domain.model.UserData
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.request.*
import javax.inject.Inject

class UserInformationImpl @Inject constructor(
    private val httpClient: HttpClient
) : UserInformation {
    override suspend fun getAllUsers(): Resource<List<UserData>> {
        return try {
            Resource.Success(
             httpClient.get { url("https://jsonplaceholder.typicode.com/albums") }.body()
            )

        } catch (e: Exception){
            e.printStackTrace()
            Resource.Failure(e)

        }
    }
//    override suspend fun getAllUsers():List<UserData> {
//        return try {
//
//
//
//
//               val response = httpClient.get(
//                   "https://jsonplaceholder.typicode.com/albums")
//                   .body <List<UserData>>()
//            println(response)
//            Log.d("UserInformationImpl", "${response}") // Debug level message
//            response
//
//        } catch (e: RedirectResponseException){
//
//           println("Error, ${e.response.status.description}")
//            emptyList()
//        }
//    }
}