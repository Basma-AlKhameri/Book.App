package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class Book_Details : AppCompatActivity() {

    lateinit var Text_escription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)


       /* Text_escription= findViewById(R.id.Description)
        Text_escription.movementMethod=ScrollingMovementMethod()*/
    }
}