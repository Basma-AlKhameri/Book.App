package com.example.bookapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.bookapp.Database.entities.Category
import com.example.bookapp.R

class CategoryListAdapter(private val LCategory: LiveData<List<Category>>) :
    RecyclerView.Adapter<CategoryListAdapter.myviewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return myviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myviewHolder, position: Int) {
        val list = LCategory.value
        val curruntItem = list?.get(position)?.Category_name
        holder.textC.text = curruntItem

    }

    override fun getItemCount(): Int {
        return listOf(LCategory).size
    }

    class myviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textC: TextView = itemView.findViewById(R.id.list_category)
    }
}








