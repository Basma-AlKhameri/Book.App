package com.example.bookapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import com.example.bookapp.fragment.CartFirstFragment
import com.example.bookapp.fragment.CartSecondFragment
import com.example.bookapp.fragment.CartThirdFragment

class CartAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStatePagerAdapter(fragmentManager, lifecycle) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
     return  when(position){
          0 -> CartFirstFragment()
           1-> CartSecondFragment()
           2-> CartThirdFragment()
           else -> CartFirstFragment()
       }

    }
}