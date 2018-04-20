package com.chrisgibson.trailguide.Controller

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.chrisgibson.trailguide.Adapter.ItemAdapter
import com.chrisgibson.trailguide.R
import com.chrisgibson.trailguide.Services.DataService
import com.chrisgibson.trailguide.Utilities.EXTRA_CATEGORY
import com.chrisgibson.trailguide.Utilities.EXTRA_ITEM
import kotlinx.android.synthetic.main.activity_category_items.*

class CategoryItemsActivity : AppCompatActivity() {

    lateinit var adapter : ItemAdapter

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_items)
        val selectedCategory = intent.getStringExtra(EXTRA_CATEGORY)
        selectedCategoryText.text = "$selectedCategory GEAR"

        adapter = ItemAdapter(this, DataService.getItems(selectedCategory)) {item ->
            val itemDetailIntent = Intent(this, ItemDetailActivity::class.java)
            itemDetailIntent.putExtra(EXTRA_ITEM,item)
            startActivity(itemDetailIntent)

        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutmanager = GridLayoutManager(this,spanCount)
        itemListView.layoutManager = layoutmanager
        itemListView.adapter = adapter
    }
}
