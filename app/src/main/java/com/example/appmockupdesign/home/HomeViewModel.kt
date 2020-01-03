package com.example.appmockupdesign.home

import android.content.Context
import android.os.Handler
import android.view.View
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.home.*

class HomeViewModel:ViewModel(){

    fun changLogo(context: Home){
        Handler().postDelayed({
            context.imageView.visibility = View.GONE
            context.imageView2.visibility = View.VISIBLE
        }, 2000)
    }

    fun openHomePage(context: Home){
        Handler().postDelayed({
            context.imageView2.visibility = View.GONE
            context.scrollView.visibility = View.VISIBLE
        },3000)
    }
    override fun onCleared() {
        onCleared()
        super.onCleared()
    }
}