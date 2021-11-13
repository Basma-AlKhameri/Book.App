package com.example.bookapp.fragment.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bookapp.R
import com.example.bookapp.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private var b_inding:FragmentListBinding?=null
    private val binding get() = b_inding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
      b_inding=FragmentListBinding.inflate(inflater, container, false)
        binding.addFloatingAction
       // val mFab: FloatingActionButton = findViewById(R.id.add_floatingAction)
       /* view.floatingActionButton.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_addFragment)

        }*/
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        b_inding=null
    }


}