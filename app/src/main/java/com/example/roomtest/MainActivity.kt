package com.example.roomtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        mainViewModel = ViewModelProvider(this, UserViewModelFactory(application)).get(MainViewModel::class.java)



        mainViewModel.addUser(User(1,"radhe","chetanya"))

        mainViewModel.addUser(User(2,"radhe","chetanya"))
        mainViewModel.addUser(User(4,"radhe","chetanya"))
        mainViewModel.addUser(User(5,"radhe","chetanya"))
        mainViewModel.addUser(User(6,"radhe","chetanya"))



        mainViewModel.readAllUser.observe(this, Observer {

            Log.d("TEST", it.toString())
        })
    }
}