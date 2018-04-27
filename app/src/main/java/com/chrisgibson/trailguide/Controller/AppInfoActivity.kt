package com.chrisgibson.trailguide.Controller

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.Toast
import com.chrisgibson.trailguide.R
import kotlinx.android.synthetic.main.activity_app_info.*

class AppInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_info)

            animation_view.setOnClickListener(View.OnClickListener {
                animation_view.playAnimation()
                Toast.makeText(this, "Click and hold to go to DEVSLOPES.COM.", Toast.LENGTH_LONG).show()
            })

            animation_view.setOnLongClickListener(View.OnLongClickListener {
                val link = Uri.parse("http://www.devslopes.com")
                val browser = Intent(Intent.ACTION_VIEW, link)
                startActivity(browser)
                true})
    }

    fun appInfoBackClicked (view:View){
        val appInfoBackIntent = Intent(this, MainActivity::class.java)
        startActivity(appInfoBackIntent)
    }
}
