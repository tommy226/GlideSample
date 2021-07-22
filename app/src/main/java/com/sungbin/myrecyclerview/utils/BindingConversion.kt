package com.sungbin.myrecyclerview.utils

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.sungbin.myrecyclerview.R

object BindingConversion {
    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImgae(imageView: ImageView, url: String){
        Glide.with(imageView)
            .load(url)
            .error(R.drawable.ic_launcher_foreground)
            .into(imageView)
    }
}