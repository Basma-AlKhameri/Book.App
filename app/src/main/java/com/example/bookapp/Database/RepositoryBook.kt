package com.example.bookapp.Database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.Category

class RepositoryBook(private val bookDao: BookDao) {

    suspend fun insertCategory(category: Category)=
        bookDao.insertCategory(category)

     fun getCategory(Category_name:String): LiveData<List<Category>> {
         return bookDao.getCategory(Category_name)
     }
//today
        suspend fun insertBook(book: Book) {
            bookDao.insertBook(book)
        }
}





