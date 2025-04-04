package com.roblesmoreno.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.roblesmoreno.mvvm.models.User

class UserViewModel : ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    init {
        _user.value = User("Rodolfo Robles", 23, "rm.rodolfo@delta.com")
    }

    fun updateUser(user: User) {
        _user.value = _user.value?.copy(name = user.name, age = user.age, email = user.email)
    }
}