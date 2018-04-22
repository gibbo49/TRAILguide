package com.chrisgibson.trailguide.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.chrisgibson.trailguide.Model.Category
import com.chrisgibson.trailguide.R
import com.squareup.picasso.Picasso




class CategoryAdapter(val context: Context, val categories: List<Category>, val itemClick: (Category)-> Unit) : RecyclerView.Adapter<CategoryAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater
                .from(context)
                .inflate(R.layout.category_list, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit): RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory (category: Category, context: Context){
            val urlid = category.url
            val resourceId = context.resources.getIdentifier(category.image,
                    "drawable", context.packageName)
            Picasso.get()
                    .load(urlid)
                    .resize(540,400)
                    .centerCrop()
                    .error(resourceId)
                    .into(categoryImage)
            categoryName?.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}