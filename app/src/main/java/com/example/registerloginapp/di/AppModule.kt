package com.example.registerloginapp.di

import com.example.registerloginapp.store.data.UserInformationImpl
import com.example.registerloginapp.store.data.network.TmdbHttpClient
import com.example.registerloginapp.store.domain.authRespository.UserInformation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient

@InstallIn( SingletonComponent :: class)
@Module
object AppModule {
    @Provides
    fun getHttpClient(httpClient: TmdbHttpClient): HttpClient = httpClient.getHttpClient()

    @Provides
    fun provideRespository(impl:UserInformationImpl):UserInformation = impl
}