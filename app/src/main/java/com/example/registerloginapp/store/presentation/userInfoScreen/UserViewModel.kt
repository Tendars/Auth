package com.example.registerloginapp.store.presentation.userInfoScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.registerloginapp.store.data.network.Resource
import com.example.registerloginapp.store.domain.authRespository.UserInformation
import com.example.registerloginapp.store.domain.model.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val respository : UserInformation
): ViewModel() {


//    private val _userFlow: MutableStateFlow<List<UserData>> = MutableStateFlow(emptyList<UserData>())
    private val _userFlow: MutableStateFlow<List<UserData>> = MutableStateFlow(emptyList())
    val users : StateFlow<List<UserData>>  = _userFlow.asStateFlow()
//    Log.d("DAZ", "${users.value}")
    init {
        viewModelScope.launch {
//           _users.value = Resource.Loading
            _userFlow.value = respository.getAllUsers()
        }
    }
}