package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.DataClassCategoryList
import com.example.bookapp.Database.BookDao
import com.example.bookapp.Database.BookDatabase
import com.example.bookapp.adapters.CategoryListAdapter


class BookList : AppCompatActivity() {

    private lateinit var recyclerviewCategory: RecyclerView
    lateinit var list_category: List<DataClassCategoryList>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)


        // category list
        val dao: BookDao = BookDatabase.getDatabase(this).bookDao()
        /* listid= arrayOf("Science","History","Business","Biography",
          "Travel","Art")*/

        recyclerviewCategory = findViewById(R.id.category)
        recyclerviewCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerviewCategory.setHasFixedSize(true)


        list_category = arrayListOf<DataClassCategoryList>()

        var listid = dao.getCategory()
        Log.d("listBASMA", listid.toString())

        recyclerviewCategory.adapter = CategoryListAdapter(listid)
    }

    /* private fun getlist() {
         for(i in listid.indices){
             val cat= DataClass_CategoryList(listid[i])
             list_category.add(cat)
         }*/

}
