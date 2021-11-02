package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.book_image
import com.example.bookapp.R
import com.google.android.material.imageview.ShapeableImageView

class image_adapter(val imgList: ArrayList<book_image>) :
    RecyclerView.Adapter<image_adapter.myAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): image_adapter.myAdapter {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent,false)
        return image_adapter.myAdapter(itemView)
    }
    override fun onBindViewHolder(holder: image_adapter.myAdapter, position: Int) {
        val curruntItem= imgList[position]
        holder.bookImage.setImageResource(curruntItem.book_image)
    }

    override fun getItemCount(): Int {
        return imgList.size    }

    class myAdapter(itemView: View) :RecyclerView.ViewHolder(itemView){
        val bookImage: ShapeableImageView =itemView.findViewById(R.id.imageView)
    }
}