package com.example.appmockupdesign.home

import android.content.Intent
import android.os.Handler
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.mainManu.MainManu
import com.example.appmockupdesign.service.Service
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

    fun goToMainManu(context: Home){
            context.startActivity(Intent(context, MainManu::class.java))
    }

    fun goTocontaxt(context: Home){
        context.startActivity(Intent(context, Service::class.java))
    }

    override fun onCleared() {
        onCleared()
        super.onCleared()
    }
}