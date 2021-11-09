package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bookapp.Database.BookDao
import com.example.bookapp.Database.BookDatabase
import com.example.bookapp.Database.entities.Category
import com.example.bookapp.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_Page : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
//database
       /* val dao: BookDao = BookDatabase.getInstance(this).bookDao

        val category = listOf(
            Category("Science"),
            Category("History"),
            Category("Art"),
            Category("Business"),
            Category("Biography"),
            Category("Travel")
        )*/


        val bottomNavigationView2 = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        val bottomNavigationView1 = findViewById<BottomNavigationView>(R.id.bottomNavigationView1)

        val homeFragment = Home_icon_fragment()
        val favotiteFragment = Favorite_icon_fragment()
        val profileFragment = Profile_icon_fragment()
        val searchFragment = Search_icon_fragment()
        val cartFragment = Cart_icon_fragment()

        setCurrentFragment(homeFragment)

        bottomNavigationView1.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.isearch -> setCurrentFragment(searchFragment)
                R.id.icart -> setCurrentFragment(cartFragment)
            }
            true
        }

        bottomNavigationView2.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ihome -> setCurrentFragment(homeFragment)
                R.id.ifavorite -> setCurrentFragment(favotiteFragment)
                R.id.iprofile -> setCurrentFragment(profileFragment)

            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}
