package com.example.thevoices.ViewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.saveable
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
) : ViewModel() {
    var username by savedStateHandle.saveable { mutableStateOf("")}
    var password by savedStateHandle.saveable{ mutableStateOf("")}

    fun onLoginClicked(): Boolean {
        if(username == "admin" && password == "admin") {
            Log.i("LoginScreen", "Login successful")
            return true
        }
        return false
    }
}