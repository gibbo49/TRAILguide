package com.chrisgibson.trailguide.Model

class Item(val title: String, val image : String, val url : String, val desc : String) {
    override fun toString(): String {
        return title
    }
}