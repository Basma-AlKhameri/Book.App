package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.DataClass_CategoryList
import com.example.bookapp.Database.BookDao
import com.example.bookapp.Database.BookDatabase
import com.example.bookapp.Database.ViewModelBook
import com.example.bookapp.Database.entities.Category
import com.example.bookapp.adapters.Category_list
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Book_List : AppCompatActivity() {

    private lateinit var recyclerviewCategory: RecyclerView
    lateinit var BViewModel: ViewModelBook
   // var listid :LiveData< List<Category>> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        BViewModel= ViewModelProvider(this).get(ViewModelBook::class.java)

        // category list
        val dao: BookDao = BookDatabase.getDatabase(this).bookDao()
       /* listid= arrayOf("Science","History","Business","Biography",
        "Travel","Art")*/
        val adapter= Category_list()
        recyclerviewCategory.adapter= adapter

val c= Category("Science")
            recyclerviewCategory=findViewById(R.id.category)
        recyclerviewCategory.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerviewCategory.setHasFixedSize(true)

BViewModel.insertCategory(c)
        BViewModel.readAll.observe(this, Observer {
            adapter.setData(it)
        })
            //listid = dao.getCategory()

       // Log.d("list", listid.toString())
        //recyclerviewCategory.adapter= Category_list(listid)
    }

   /* private fun getlist() {
        for(i in listid.indices){
            val cat= DataClass_CategoryList(listid[i])
            list_category.add(cat)
        }*/

}
