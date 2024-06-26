package com.example.registerloginapp.store.presentation.signupscreen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(): ViewModel() {
    var text: String by  mutableStateOf("")
        private set
    var textE: String by  mutableStateOf("")
        private set
    fun changeValue(input:String){

        text = input
        Log.d("USERsinput", "${input}")

    }
    fun changeValueE(input:String){

        textE = input
        Log.d("USERsinput", "${input}")

    }
}