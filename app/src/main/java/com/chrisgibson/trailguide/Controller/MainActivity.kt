package com.chrisgibson.trailguide.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.chrisgibson.trailguide.Adapter.CategoryAdapter
import com.chrisgibson.trailguide.R
import com.chrisgibson.trailguide.Services.DataService
import com.chrisgibson.trailguide.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            setSupportActionBar(findViewById(R.id.toolbar))

            adapter = CategoryAdapter(this, DataService.categories){category ->
                val categoryItemsIntent = Intent(this,CategoryItemsActivity::class.java)
                categoryItemsIntent.putExtra(EXTRA_CATEGORY,category.title)
                mainprogressBar.visibility = View.VISIBLE
                startActivity(categoryItemsIntent)
            }
            categoryListView.adapter = adapter

            val layoutManager = LinearLayoutManager(this)
            categoryListView.layoutManager = layoutManager
            categoryListView.setHasFixedSize(true)
        }

        fun appInfoBtnClicked (view:View){
            val appInfoIntent = Intent(this, AppInfoActivity::class.java)
            startActivity(appInfoIntent)
        }

    override fun onResume() {
        super.onResume()
        mainprogressBar.visibility = View.INVISIBLE
    }

}
