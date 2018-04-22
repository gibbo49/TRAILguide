package com.chrisgibson.trailguide.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.chrisgibson.trailguide.Model.Item
import com.chrisgibson.trailguide.R
import com.chrisgibson.trailguide.Utilities.SWITCH
import com.squareup.picasso.Picasso

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
        val itemText = itemView?.findViewById<TextView>(R.id.itemText)

        fun bindProduct(item:Item,context: Context) {

                if (SWITCH == "urlId") {
                    val urlId = item.imageurl
                    val resourceId = context.resources.getIdentifier(item.image,
                            "drawable", context.packageName)
                    Picasso.get()
                            .load(urlId)
                            .placeholder(resourceId)
                            .error(resourceId)
                            .into(itemImage)
                    itemText?.text = item.title
                    itemView.setOnClickListener { itemClick(item) }
                }
                else {
                    val resourceId = context.resources.getIdentifier(item.image,
                            "drawable", context.packageName)
                    Picasso.get()
                            .load(resourceId)
                            .placeholder(resourceId)
                            .error(resourceId)
                            .into(itemImage)
                    itemText?.text = item.title
                    itemView.setOnClickListener { itemClick(item) }
                }
        }
    }
}