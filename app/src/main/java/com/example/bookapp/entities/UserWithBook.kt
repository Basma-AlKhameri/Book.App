package com.example.bookapp.entities

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithBook(
    @Embedded val user: User ,
    @Relation(
        parentColumn = "user_name",
        entityColumn  = "UserAddBook"
    )
    val book: List<Book>

)
