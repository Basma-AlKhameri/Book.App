package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.bookapp.adapters.ViewPagerAdapter
import com.example.bookapp.databinding.ActivityMainBinding
import com.example.bookapp.fragment.LoginFragment
import com.example.bookapp.fragment.SignUpFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
//splash screen
        setTheme(R.style.Theme_BookApp)
        setContentView(binding.root)
        setUpTaps()
    }
    private fun setUpTaps(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        val viewPager:ViewPager=findViewById(R.id.viewPager)
        val tabLayout: TabLayout =findViewById(R.id.tabs)
        adapter.addFragment(LoginFragment(),"Sign In")
        adapter.addFragment(SignUpFragment(),"sign Up")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)


    }
}