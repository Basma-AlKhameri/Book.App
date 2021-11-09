package com.example.bookapp.entities

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithCategory(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "Category_name",
        entityColumn  = "userSelectCategory"
    )
    val book: List<Book>

)
