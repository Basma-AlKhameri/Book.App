package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.images
import com.example.bookapp.adapters.Category_recyclerview_adapter
import com.example.bookapp.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_Page : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

         val homeFragment = Home_icon_fragment()
        val favotiteFragment=favorite_icon_fragment()
        val profileFragment= profile_icon_fragment()
        val searchFragment= search_icon_fragment()
        val cartFragment= cart_icon_fragment()

        setCurrentFragment(homeFragment)

        BottomNavigationView.OnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.ihome -> setCurrentFragment(homeFragment)
                R.id.ifavorite -> setCurrentFragment(favotiteFragment)
                R.id.iprofile -> setCurrentFragment(profileFragment)

                R.id.isearch-> setCurrentFragment(searchFragment)
                R.id.icart-> setCurrentFragment(cartFragment)
            }
            true
        }

    }
private fun setCurrentFragment(fragment: Fragment)= supportFragmentManager.beginTransaction()
    .apply { replace(R.id.flFragment, fragment)
        commit()
    }
}
