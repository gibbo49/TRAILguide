package com.chrisgibson.trailguide.Controller

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chrisgibson.trailguide.R
import kotlinx.android.synthetic.main.activity_app_info.*

class AppInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_info)

        animation_view.setOnClickListener {
            val link = Uri.parse("http://www.devslopes.com")
            val browser = Intent(Intent.ACTION_VIEW, link)
            startActivity(browser)
        }

        appInfoBackBtn.setOnClickListener {
            val appInfoBackIntent = Intent(this, MainActivity::class.java)
            startActivity(appInfoBackIntent)
        }
    }
}
