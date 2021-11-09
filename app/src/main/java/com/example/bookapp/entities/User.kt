package com.example.bookapp.entities

import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
@PrimaryKey val user_id: Int,
val user_name: String,
val user_address: String,
val user_password:String,
val user_email: String,

)
