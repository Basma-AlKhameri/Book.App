package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.bookapp.adapters.ViewPagerAdapter
import com.example.bookapp.fragment.LoginFragment
import com.example.bookapp.fragment.SignUpFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//splash screen
        setTheme(R.style.Theme_BookApp)
        setContentView(R.layout.activity_main)
        setUpTaps()
    }
    private fun setUpTaps(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        val viewPager:ViewPager=findViewById(R.id.viewPager)
        val tabLayout: TabLayout =findViewById(R.id.tabs)
        adapter.addFragment(LoginFragment(),"logIn")
        adapter.addFragment(SignUpFragment(),"signUp")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        //tabLayout.getTabAt(0)!!.setIcon()


    }
}