package com.example.myrecyclerview

import android.util.Log

class MyModel(var name: String? = null, var profileImage: String? =null) {

    private val TAG = "MyModel"

    init {
        Log.d(TAG, "MyModel Init Called")
    }
}