package com.example.bookapp.Database.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.User

data class UserWithBook(
    @Embedded val user: User,
    @Relation(
        parentColumn = "user_name",
        entityColumn  = "user_name"
    )
    val book: List<Book>

)
