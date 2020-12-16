package com.example.roomtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name="id")
        var id:Int,
        @ColumnInfo(name="name")
        var name:String,
        @ColumnInfo(name="school")
        var school:String)

