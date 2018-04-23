package com.chrisgibson.trailguide.Controller

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.chrisgibson.trailguide.R
import kotlinx.android.synthetic.main.activity_app_info.*

class AppInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_info)
    }

    fun animationClicked (view:View){
        val link = Uri.parse("http://www.devslopes.com")
        val browser = Intent(Intent.ACTION_VIEW, link)
        startActivity(browser)
    }

    fun appInfoBackClicked (view:View){
        val appInfoBackIntent = Intent(this, MainActivity::class.java)
        startActivity(appInfoBackIntent)
    }
}
