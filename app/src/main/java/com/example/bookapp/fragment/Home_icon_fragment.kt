package com.example.bookapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.book_image
import com.example.bookapp.DataClass.images
import com.example.bookapp.R
import com.example.bookapp.adapters.Category_recyclerview_adapter
import com.example.bookapp.adapters.image_adapter


class Home_icon_fragment : Fragment(R.layout.home_icon_fragment) {

    //category recyclerview
    private lateinit var recyclerview: RecyclerView
    lateinit var c_list_image: ArrayList<images>
    lateinit var c_imageId: Array<Int>

   // image recyclerview
   private lateinit var recyclerviewimage: RecyclerView
    lateinit var b_list_image: ArrayList<book_image>
    lateinit var b_imageId: Array<Int>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_icon_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        c_imageId = arrayOf(
            R.drawable.science_category,
            R.drawable.travel_category,
            R.drawable.biography_category,
            R.drawable.history_category,
            R.drawable.art_category,
            R.drawable.business_category
        )

        recyclerview = view.findViewById(R.id.recyclerview)

        recyclerview.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.setHasFixedSize(true)

        c_list_image = arrayListOf<images>()
        getImages()

        b_imageId= arrayOf(
                    R.drawable.science_category,
            R.drawable.travel_category,
            R.drawable.biography_category,
            R.drawable.history_category,
            R.drawable.art_category,
            R.drawable.business_category)

        b_list_image= arrayListOf<book_image>()
        getBookImages()

        recyclerviewimage=view.findViewById(R.id.recyclerView_image)

        recyclerviewimage.layoutManager= GridLayoutManager(this.context,
            2)
        recyclerviewimage.setHasFixedSize(true)

    }

private fun getBookImages() {
    for(i in b_imageId.indices){
        val bppkimg= book_image(b_imageId[i])
        b_list_image.add(bppkimg)
    }
    recyclerviewimage.adapter= image_adapter(b_list_image)
}



    private fun getImages() {
        for(i in c_imageId.indices){
            val ic= images(c_imageId[i])
           c_list_image.add(ic)
        }
        recyclerview.adapter= Category_recyclerview_adapter(c_list_image)
    }


}


