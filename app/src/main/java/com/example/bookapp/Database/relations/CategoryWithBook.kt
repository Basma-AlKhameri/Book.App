package com.example.bookapp.Database.relations

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.Category

@Entity
data class CategoryWithBook(
    @Embedded val category: String,
    @Relation(
        parentColumn = "Category_name",
        entityColumn  = "Category_name"
    )
    val book: List<Book>

    )
