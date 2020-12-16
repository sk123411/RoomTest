package com.example.roomtest

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDAO {

    @Query("Select * from user")
    fun getAllUsers():LiveData<List<User>>

    @Insert
    suspend fun addUser(user: User)
}