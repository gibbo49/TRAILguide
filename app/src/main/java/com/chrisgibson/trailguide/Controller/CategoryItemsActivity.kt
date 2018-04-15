package com.chrisgibson.trailguide.Controller

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chrisgibson.trailguide.Adapter.ItemAdapter
import com.chrisgibson.trailguide.R
import com.chrisgibson.trailguide.Services.DataService
import com.chrisgibson.trailguide.Utilities.EXTRA_CATEGORY
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
            startActivity(itemDeatilIntent)

        }
    }
}
