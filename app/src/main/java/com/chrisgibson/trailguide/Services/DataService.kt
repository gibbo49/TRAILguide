package com.chrisgibson.trailguide.Services

import com.chrisgibson.trailguide.Model.Category
import com.chrisgibson.trailguide.Model.Item

object DataService {

    val categories = listOf(
            Category("HIKING", "hiking"),
            Category("CAMPING", "camping"),
            Category("FISHING", "fishing"),
            Category("SURFING", "surfing"),
            Category("DIVING", "diving")
    )
    val hiking = listOf(
            Item("BACKPACK","backpack","",""),
            Item("BOOTS","boots","",""),
            Item("COMPASS","compass","",""),
            Item("FLASHLIGHT","flashlight","",""),
            Item("MAP","map","",""),
            Item("ROPE","rope","",""),
            Item("TOOLS","tools","","")
    )
    val camping = listOf(
            Item("FLASHLIGHT","flashlight","",""),
            Item("ROPE","rope","",""),
            Item("TOOLS","tools","",""),
            Item("MAP","map","",""),
            Item("TENT","tent","",""),
            Item("GRILL","grill","",""),
            Item("KNIFE","knife","",""),
            Item("BACKPACK", "backpack","",""),
            Item("BOOTS", "boots","","")
    )
    val fishing = listOf(
            Item("BACKPACK","backpack","",""),
            Item("BOOTS","boots","",""),
            Item("FISHING ROD","fishing_rod","",""),
            Item("FLASHLIGHT","flashlight","",""),
            Item("HOOK","hook","",""),
            Item("KNIFE","knife","",""),
            Item("LURE","lure","",""),
            Item("TOOLS","tools","","")
    )
    val surfing = listOf(
            Item("BACKPACK","backpack","","")
    )
    val diving = listOf(
            Item("FLIPPERS","flippers","",""),
            Item("KNIFE","knife","",""),
            Item("MASK","mask","",""),
            Item("OXYGEN","ox","",""),
            Item("OXYGEN MASK","ox_mask","",""),
            Item("ROPE","rope","",""),
            Item("TOOLS", "tools","","")
    )

    fun getItems(category: String):List<Item>{
        return when(category) {
            "HIKING" -> hiking
            "CAMPING" -> camping
            "FISHING" -> fishing
            "SURFING" -> surfing
            else -> diving
        }
    }
}