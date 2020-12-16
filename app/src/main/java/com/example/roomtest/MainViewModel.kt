package com.example.roomtest

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

 class MainViewModel constructor(application: Application) :AndroidViewModel(application){

     var repository: UserRepository
     var userDAO: UserDAO
     var readAllUser:LiveData<List<User>>

    init {
        userDAO = UserDatabase.getInstance(application).userDAO()
        repository = UserRepository(userDAO)

        readAllUser =repository.readAllUsers

    }

     fun addUser(user: User){


        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(user)
        }



    }



}