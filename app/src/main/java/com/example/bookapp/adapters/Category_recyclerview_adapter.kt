package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.images
import com.example.bookapp.R
import com.google.android.material.imageview.ShapeableImageView

class Category_recyclerview_adapter(val limage: ArrayList<images>):
    RecyclerView.Adapter<Category_recyclerview_adapter.myViewHolder> (){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
            val itemView=
                LayoutInflater.from(parent.context).inflate(R.layout.category_card, parent,false)
            return myViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: myViewHolder, position: Int) {
            val curruntItem= limage[position]
            holder.c_img.setImageResource(curruntItem.images)

        }
        override fun getItemCount(): Int {
            return limage.size
        }

        class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val c_img: ShapeableImageView = itemView.findViewById(R.id.imageCard)
        }
    }