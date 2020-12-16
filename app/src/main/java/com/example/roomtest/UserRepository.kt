package com.example.roomtest

import androidx.lifecycle.LiveData

class UserRepository(val userDAO: UserDAO){

    val readAllUsers = userDAO.getAllUsers()



    suspend fun addUser(user: User){
        userDAO.addUser(user)

    }




}