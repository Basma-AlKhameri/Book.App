package com.example.bookapp.entities

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey val Book_id: Int,
    val book_name: String,
    val price: Int,
    val author:String,
    val description: String,
    val image: Image,
    val userSelectCategory: String


)