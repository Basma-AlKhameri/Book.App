package com.example.bookapp.Database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
    @PrimaryKey val Category_name: String
)
