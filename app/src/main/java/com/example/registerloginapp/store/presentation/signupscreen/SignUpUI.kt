package com.example.registerloginapp.store.presentation.signupscreen

import android.util.Log
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.registerloginapp.store.presentation.userInfoScreen.UserViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpUi(){
    val viewmodel = viewModel<SignUpViewModel>()
    val viewmodel1 = viewModel<UserViewModel>()
    Log.d("TEXT", "${viewmodel1.users.value}")

//    var text by remember{ mutableStateOf("")}
    OutlinedTextField(
        value = viewmodel.text,
        onValueChange = {text -> viewmodel.changeValue(text)}

    )


}



@Preview(showBackground = true)
@Composable
fun SignUpUiPreview(){

}

