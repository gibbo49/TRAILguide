package com.chrisgibson.trailguide.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.chrisgibson.trailguide.Model.Item
import com.chrisgibson.trailguide.R
import kotlinx.android.synthetic.main.activity_category_items.view.*

class ItemAdapter(val context: Context, val items : List<Item>, val itemClick: (Item) -> Unit): RecyclerView.Adapter<ItemAdapter.ItemHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.items_list,parent,false)
        return ItemHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder:ItemHolder, position: Int) {
        holder.bindProduct(items[position],context)
    }

    inner class ItemHolder(itemView: View?, val itemClick: (Item) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val itemImage = itemView?.findViewById<ImageView>(R.id.itemImage)

        fun bindProduct(item:Item,context: Context) {
        val resourceID = context.resources.getIdentifier(item.image,
                "drawable",context.packageName)
            itemImage?.setImageResource(resourceID)
            itemView.setOnClickListener { itemClick(item) }
        }
    }

}