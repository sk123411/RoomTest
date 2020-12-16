package com.example.roomtest

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 2, exportSchema = false)
 abstract class UserDatabase() : RoomDatabase() {

    abstract fun userDAO(): UserDAO



    companion object {
        val INSTANCE: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase {

            @Volatile
            if (INSTANCE != null) {
                return INSTANCE
            }
            synchronized(this) {

                val instance = Room.databaseBuilder(
                        context.applicationContext, UserDatabase::class.java, "users.db").fallbackToDestructiveMigration().build()
                return instance
            }

        }

    }


}