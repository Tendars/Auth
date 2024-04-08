package com.example.registerloginapp.store.presentation.userInfoScreen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.registerloginapp.store.domain.model.UserData
import java.lang.reflect.Modifier

//@Composable
//fun UserListUi(){
//    val userViewModelJunk = viewModel<UserViewModel>()
//    val usersJunk = userViewModelJunk.users.collectAsState()
//
//
//    LazyColumn(
////        modifier = Modifier.fillMaxSize(),
////        contentPadding = PaddingValues(8.dp)
//    ){
//    items(items = usersJunk.value){item ->
//        Log.d("USERSLIST", "${item.title}")
//        UserInfoUi( userj = item)
//
//    }
//    }
//
//}
//
//@Composable
//fun UserInfoUi(userj : UserData ){
//
//Column(
////    modifier = Modifier.fillMaxSize()
//){
//    Text(text = userj.title)
//}
//}