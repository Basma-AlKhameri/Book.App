package com.example.bookapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bookapp.Database.BookDao
import com.example.bookapp.Database.BookDatabase
import com.example.bookapp.Database.ViewModelBook
import com.example.bookapp.Database.entities.Book
import com.example.bookapp.Database.entities.Category
//import com.example.bookapp.databinding.ActivityMainBinding
import com.example.bookapp.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity() {

     lateinit var viewModel:ViewModelBook

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val intent=Intent(this, Cart::class.java)

        viewModel=ViewModelProvider(this).get(ViewModelBook::class.java)

        val category1 = listOf(
            Category("Science"),
            Category("History"),
            Category("Art"),
            Category("Business"),
            Category("Biography"),
            Category("Travel") )

            for(i in category1){
                viewModel.insertCategory(i)
        }

//database
     // val dao: BookDao = BookDatabase.getDatabase(this).bookDao()

        val book = listOf(
            Book(1,"Lives of Weeds: Opportunism, Resistance, Folly"
            ,10,"John Cardina","  "," ","Science",),
            Book(2,"Plagues Upon the Earth: Disease and the Course of Human History"
                ,10,"Kyle Harper","  "," ","Science"),
            Book(3,"Trans: When Ideology Meets Reality"
                ,10,"Helen Joyce","  "," ","Science"),
            Book(4,"Life as We Made It: How 50,000 Years of Human Innovation Refined—and Redefined—Nature"
                ,10,"Beth Shapiro","  "," ","Science"),
            Book(5,"Our Biggest Experiment: An Epic History of the Climate Crisis"
                ,10,"Alice Bell","  "," ","Science"),
            Book(6,"The Gilded Page: The Secret Lives of Medieval Manuscripts"
                ,10,"Mary Wellesley","  "," ","Science"),
            Book(7,"True Raiders: The Untold Story of the 1909 Expedition to Find the Legendary Ark of the Covenant"
                ,10,"Brad Ricca","  "," ","Science"),
            Book(8,"The Secret of Life: Rosalind Franklin, James Watson, Francis Crick, and the Discovery of DNA's Double Helix"
                ,10,"Howard Markel","  "," ","Science"),
            //second category
            Book(11,"The Long War: The Inside Story of America and Afghanistan Since 9/11"
                ,10,"David Loyn","  "," ","History"),
            Book(11,"Henry II and Eleanor of Aquitaine: Founding an Empire"
                ,10,"Matthew Lewis","  "," ","History"),
            Book(12,"She Persisted: Margaret Chase Smith"
                ,10,"Ruby Shamir" +
                        "Chelsea Clinton","  "," ","History"),
            Book(13,"What is History, Now?"
                ,10,"Suzannah Lipscomb","  "," ","History"),
            Book(14,"The Dressmakers of Auschwitz: The True Story of the Women Who Sewed to Survive"
                ,10,"Lucy Adlington","  "," ","History"),
            Book(15,"Coffeeland: One Man's Dark Empire and the Making of Our Favorite Drug"
                ,10,"Augustine Sedgewick","  "," ","History"),
            Book(16,"Unearthing The Secret Garden: The Plants and Places That Inspired Frances Hodgson Burnett"
                ,10,"Marta McDowell","  "," ","History"),
            Book(19,"CCode Name Badass: The True Story Of Virginia Hal"
                ,10,"Heather Demetrios","  "," ","History"),
            //third category
            Book(20,"The Lost Notebook of Édouard Manet"
                ,10,"Maureen Gibbon","  "," ","Art"),
            Book(21,"The Stolen Lady"
                ,10,"Laura Morelli","  "," ","Art"),
            Book(22,"Between the Lines"
                ,10, "Lindsay Ward","  "," ","Art"),
            Book(23,"Makeda: The Queen of Sheba"
                ,10,"Marlon McKenney","  "," ","Art"),
            Book(24,"Major Labels: A History of Popular Music in Seven Genres"
                ,10,"Kelefa Sanneh","  "," ","Art"),
            Book(25,"There’s A Ghost In This House"
                ,10,"Oliver Jeffers","  "," ","Art")

        )
        for(i in book) {
                     viewModel.insertBook(i)
        }


        val bottomNavigationView2 = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        val bottomNavigationView1 = findViewById<BottomNavigationView>(R.id.bottomNavigationView1)

        val homeFragment = HomeFragment()
        val favotiteFragment = FavoriteFragment()
        val profileFragment = ProfileFragment()
        val searchFragment = SearchFragment()

        setCurrentFragment(homeFragment)
        bottomNavigationView1.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.isearch -> setCurrentFragment(searchFragment)
                R.id.icart -> startActivity(intent)
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