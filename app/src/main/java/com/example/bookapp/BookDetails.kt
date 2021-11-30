package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class BookDetails : AppCompatActivity() {
lateinit var fav_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)
fav_button=findViewById(R.id.icon)
        fav_button.setOnClickListener{
            fav_button.isSelected = !fav_button.isSelected
        }


    }
}