package com.example.bookapp.Database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.RoomDatabase
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.Category
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModelBook (application: Application):AndroidViewModel(application){

    private val repository : RepositoryBook
    // var readAll: LiveData<List<Category>>

    init {
        val BookDB = BookDatabase.getDatabase(application).bookDao()
        repository = RepositoryBook(BookDB)
     //   readAll = repository.getCategory()
    }
    fun insertCategory(category: Category){
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertCategory(category)
        }
    }
//today
       fun insertBook(book: Book){
               viewModelScope.launch(Dispatchers.IO) {
                       repository.insertBook(book)
                 }
       }

    fun getAllCategoy(Category_name:String):LiveData<List<Category>>{
                return repository.getCategory(Category_name)}
}