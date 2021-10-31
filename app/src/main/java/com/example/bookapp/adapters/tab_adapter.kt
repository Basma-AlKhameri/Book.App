package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.DataClass.dataClass_tab
import com.example.bookapp.R
import com.google.android.material.imageview.ShapeableImageView

class tab_adapter (private val THeading: ArrayList<dataClass_tab>):
    RecyclerView.Adapter<tab_adapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.category_card, parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val curruntItem= THeading[position]
        holder.tab.text = curruntItem.Heading

    }

    override fun getItemCount(): Int {
        return THeading.size
    }

    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val tab: TextView =itemView.findViewById(R.id.explor_tap)
    }
}