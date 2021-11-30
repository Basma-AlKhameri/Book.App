package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.book_image
import com.example.bookapp.R
import com.google.android.material.imageview.ShapeableImageView

class ImageAdapter(val imgList: ArrayList<book_image>) :
    RecyclerView.Adapter<ImageAdapter.myAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.myAdapter {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent,false)
        return myAdapter(itemView)
    }

    override fun onBindViewHolder(holder:myAdapter, position: Int) {
        val curruntItem= imgList[position]
        holder.bookImage.setImageResource(curruntItem.book_image)
    }

    override fun getItemCount(): Int {
        return imgList.size    }

    class myAdapter(itemView: View) :RecyclerView.ViewHolder(itemView){
        val bookImage: ShapeableImageView =itemView.findViewById(R.id.imageView)
    }
}