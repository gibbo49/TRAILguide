package com.chrisgibson.trailguide.Controller

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.chrisgibson.trailguide.Model.Item
import com.chrisgibson.trailguide.R
import com.chrisgibson.trailguide.Utilities.EXTRA_ITEM
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_item_detail.*

class ItemDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        val itemDetail = intent.getParcelableExtra<Item>(EXTRA_ITEM)
        val itemImage = itemDetail.image
        val resourceId = resources.getIdentifier(itemImage,"drawable",packageName)
        val imageurl = itemDetail.imageurl

        itemTitleText.text = itemDetail.title
        itemDescText.text = itemDetail.desc

        Picasso.get()
                .load(imageurl)
                .error(resourceId)
                .into(itemImageView)
    }

    fun openLink (view: View){
        val itemUrl = intent.getParcelableExtra<Item>(EXTRA_ITEM)
        val link = Uri.parse(itemUrl.linkurl)
        val browser = Intent(Intent.ACTION_VIEW, link)
        startActivity(browser)
    }
}
