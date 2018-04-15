package com.chrisgibson.trailguide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            // Note that the Toolbar defined in the layout has the id "my_toolbar"
            setSupportActionBar(findViewById(R.id.toolbar))
        }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }


}
