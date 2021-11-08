package com.example.bookapp.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation

@Entity
data class CategoryWithBook(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "Category_name",
        entityColumn  = "userSelectCategory"
    )
    val book: List<Book>

    )
