package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.heading
import com.example.bookapp.R
import com.google.android.material.imageview.ShapeableImageView

class tab_adapter (private val THeading: ArrayList<heading>):
    RecyclerView.Adapter<tab_adapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.list_tab, parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val curruntItem= THeading[position]
        holder.tab.text = curruntItem.heading

    }

    override fun getItemCount(): Int {
        return THeading.size
    }

    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val tab: TextView =itemView.findViewById(R.id.list_heading)
    }
}