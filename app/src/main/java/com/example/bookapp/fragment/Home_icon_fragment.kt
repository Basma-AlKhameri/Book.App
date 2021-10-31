package com.example.bookapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.heading
import com.example.bookapp.DataClass.images
import com.example.bookapp.R
import com.example.bookapp.adapters.Category_recyclerview_adapter
import com.example.bookapp.adapters.tab_adapter

class Home_icon_fragment : Fragment(R.layout.home_icon_fragment) {
    private lateinit var recyclerview: RecyclerView
    private lateinit var recyclerviewTab: RecyclerView
    lateinit var list_image: ArrayList<images>
    lateinit var list_Tab: ArrayList<heading>
    lateinit var imageId: Array<Int>
    lateinit var headingId : Array<String>


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

        headingId = arrayOf(
            "Explore",
            "Best Seller",
            "Newest"
        )
        recyclerview= view.findViewById(R.id.recyclerview)
        recyclerviewTab=view.findViewById(R.id.recyclerviewTab)

        recyclerview.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.setHasFixedSize(true)

        recyclerviewTab.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerviewTab.setHasFixedSize(true)


        list_image = arrayListOf<images>()
        getImages()

        list_Tab = arrayListOf<heading>()
        getTab()
    }

    private fun getTab() {
        for(i in headingId.indices){
            val tab= heading(headingId[i])
            list_Tab.add(tab)
        }
        recyclerviewTab.adapter= tab_adapter(list_Tab)

    }

    private fun getImages() {
        for(i in imageId.indices){
            val ic= images(imageId[i])
            list_image.add(ic)
        }
        recyclerview.adapter= Category_recyclerview_adapter(list_image)

    }
}


