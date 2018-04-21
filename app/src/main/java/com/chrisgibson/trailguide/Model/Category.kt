package com.chrisgibson.trailguide.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Category(val title: String, val image: String, val url: String) : Parcelable