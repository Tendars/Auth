package com.example.registerloginapp.store.presentation.signupscreen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.registerloginapp.store.presentation.userInfoScreen.UserViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpUi() {
    val viewmodel = viewModel<SignUpViewModel>()
//    val viewmodel1 = viewModel<UserViewModel>()
//    Log.d("TEXT", "${viewmodel1.users.value}")

//    var text by remember{ mutableStateOf("")}
    Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
        ){
Column(
    modifier = Modifier.fillMaxSize() ,
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {
        FullName(
            modifier = Modifier
                .testTag("my_FullNames")
                .padding(16.dp),
            text = viewmodel.text,
            onValueChange = { value ->
                viewmodel.changeValue(value)},
            )
    Spacer(modifier = Modifier.height(32.dp))
        EmailText(
            modifier = Modifier
                .testTag("my_Email")
                .padding(16.dp),
            text = viewmodel.textE,
            onValueChange = { value ->
            viewmodel.changeValueE(value)}
            )
    Spacer(modifier = Modifier.height(32.dp))
    ButtonSubmit(
        modifier = Modifier
            .testTag("my_Button")
            .padding(16.dp)

    )

}


    }





//    OutlinedTextField(
//        value = viewmodel.text,
//        onValueChange = {text -> viewmodel.changeValue(text)}

//    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FullName(
              modifier: Modifier,
              text :String,
              onValueChange : (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier,
        value = text,
        onValueChange = onValueChange
    )
    
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailText(
    modifier: Modifier,
              text :String,
              onValueChange : (String) -> Unit

) {
    OutlinedTextField(
        modifier = modifier,
        value = text,
        onValueChange = onValueChange
    )

}
@Composable
fun ButtonSubmit(
    modifier: Modifier
){
    Button(onClick = { },modifier = modifier) {
        Text(text = "ButtonSubmit")
        
    }
   
}




