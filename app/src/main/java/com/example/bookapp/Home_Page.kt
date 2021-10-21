package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.images
import com.example.bookapp.adapters.Category_recyclerview_adapter

class Home_Page : AppCompatActivity() {

    private lateinit var recyclerview: RecyclerView
    lateinit var list_image:ArrayList<images>
    lateinit var imageId: Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        imageId= arrayOf(R.drawable.art_category,R.drawable.biography_category
            ,R.drawable.business_category,R.drawable.history_category,R.drawable.science_category,
            R.drawable.travel_category )

        recyclerview=findViewById(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.setHasFixedSize(true)

        list_image  = arrayListOf<images>()
        getImages()
    }

    private fun getImages() {
        for(i in imageId.indices){
            val ic=images(imageId[i])
            list_image.add(ic)
        }
        recyclerview.adapter= Category_recyclerview_adapter(list_image)

    }

}