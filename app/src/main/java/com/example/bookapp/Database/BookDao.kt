package com.example.bookapp.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.Category
import com.example.bookapp.Database.entities.User
import com.example.bookapp.Database.relations.CategoryWithBook

@Dao
interface BookDao {

   /* @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insertBook(book:Book)*/

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertCategory(category:Category)


    /*  @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insertUser(user:User)*/

    @Transaction
    @Query("SELECT * FROM Category")
     fun getCategory():LiveData<List<Category>>

// @Transaction
// @Query("SELECT * FROM Category")
// suspend fun getCategoryWithBook():List<CategoryWithBook>
//
//    @Transaction
//    @Query("SELECT * FROM User")
//    suspend fun getUserWithBook():List<CategoryWithBook>



}