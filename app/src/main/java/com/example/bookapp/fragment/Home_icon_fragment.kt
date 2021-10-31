package com.example.bookapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.images
import com.example.bookapp.R
import com.example.bookapp.adapters.Category_recyclerview_adapter

class Home_icon_fragment : Fragment(R.layout.home_icon_fragment) {
    private lateinit var recyclerview: RecyclerView
    lateinit var list_image: ArrayList<images>
    lateinit var imageId: Array<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_icon_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageId = arrayOf(
            R.drawable.art_category,
            R.drawable.biography_category,
            R.drawable.business_category,
            R.drawable.history_category,
            R.drawable.science_category,
            R.drawable.travel_category
        )
        recyclerview= view.findViewById(R.id.recyclerview)

        recyclerview.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.setHasFixedSize(true)

        list_image = arrayListOf<images>()
        getImages()
    }
    private fun getImages() {
        for(i in imageId.indices){
            val ic= images(imageId[i])
            list_image.add(ic)
        }
        recyclerview.adapter= Category_recyclerview_adapter(list_image)

    }
}