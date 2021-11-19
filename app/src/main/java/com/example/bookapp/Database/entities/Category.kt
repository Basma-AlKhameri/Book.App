package com.example.bookapp.Database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cat_table")
data class Category(
    @PrimaryKey(autoGenerate = false)
    val Category_name: String
)
