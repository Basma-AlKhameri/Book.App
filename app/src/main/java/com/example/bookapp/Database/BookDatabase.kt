package com.example.bookapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.Category
import com.example.bookapp.Database.entities.User


@Database(
    entities = [
        Book::class,
        Category::class,
        User::class,
    ],
    version = 1
)
abstract class BookDatabase : RoomDatabase() {
    abstract val bookDao: BookDao

    companion object {
        @Volatile
        private var INSTANCE: BookDatabase? = null

        fun getDatabase(context: Context): BookDatabase {
            synchronized(this) {
                // if the INSTANCE is not null, then return it,
                // if it is, then create the database
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext, BookDatabase::class.java, "book.db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}