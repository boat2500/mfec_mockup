package com.example.appmockupdesign.service

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModel

class serviewViewModel: ViewModel(){

    fun training(item: LinearLayout){
        when (item.visibility.toString()) {
            "0" -> item.visibility = View.GONE
            "8" -> item.visibility = View.VISIBLE
        }
    }
    fun training1(item: TextView){
        when (item.visibility.toString()) {
            "0" -> item.visibility = View.GONE
            "8" -> item.visibility = View.VISIBLE
        }
    }
}