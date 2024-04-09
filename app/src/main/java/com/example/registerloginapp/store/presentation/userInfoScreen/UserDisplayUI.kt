package com.example.registerloginapp.store.presentation.userInfoScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.registerloginapp.store.data.network.Resource

@Composable
fun UserDisplayUi(){
    val userViewModelJunk = viewModel<UserViewModel>()
    val usersJunk = userViewModelJunk.users.collectAsState()

    usersJunk.value?.let {
        when(it){
            is Resource.Failure -> {}
            Resource.Loading -> {}
            is Resource.Success -> {
              UserListUi(it.data)
            }
        }
    }
}