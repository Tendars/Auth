package com.example.registerloginapp.store.presentation.signupscreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
//import dagger.hilt.android.lifecycle.HiltViewModel

//@HiltViewModel
class SignUpViewModel(val signUpcurrentStatus: SignUpcurrentStatus
): ViewModel() {
    var text: String by  mutableStateOf("")
        private set
    fun changeValue(input:String){

        text = input

    }
}