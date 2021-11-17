package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bookapp.DataClass.DataClass_CategoryList
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.Database.entities.Category
import com.example.bookapp.R
import java.util.*
import kotlin.collections.ArrayList

class Category_list (): RecyclerView.Adapter<Category_list.myviewHolder>() {

     var LCategory = emptyList<Category>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewHolder {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent,false)
        return myviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myviewHolder, position: Int) {
        val curruntItem= LCategory[position]
        holder.textC.text = curruntItem.Category_name

    }

    override fun getItemCount(): Int {
        return LCategory.size
    }

    class myviewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textC: TextView =itemView.findViewById(R.id.list_category)
    }
    fun setData(category: List<Category>){
        this.LCategory = category
        notifyDataSetChanged()
    }
}