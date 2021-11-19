package com.example.bookapp.Database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bookapp.Database.entities.Category

class RepositoryBook(private val bookDao: BookDao) {

    suspend fun insertCategory(category: Category)=
        bookDao.insertCategory(category)

     fun getCategory(): LiveData<List<Category>> = bookDao.getCategory()


}