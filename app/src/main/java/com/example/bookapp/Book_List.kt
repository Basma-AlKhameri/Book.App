package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.DataClass_CategoryList
import com.example.bookapp.adapters.Category_list

class Book_List : AppCompatActivity() {

    private lateinit var recyclerviewCategory: RecyclerView
    lateinit var list_category: ArrayList<DataClass_CategoryList>
    lateinit var listid : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        // category list
        listid= arrayOf("Science","History","Business","Biography",
        "Travel","Art")
        recyclerviewCategory=findViewById(R.id.category)
        recyclerviewCategory.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerviewCategory.setHasFixedSize(true)

        list_category= arrayListOf<DataClass_CategoryList>()
        getlist()
    }
    private fun getlist() {
        for(i in listid.indices){
            val cat= DataClass_CategoryList(listid[i])
            list_category.add(cat)
        }
        recyclerviewCategory.adapter= Category_list(list_category)
}
    }