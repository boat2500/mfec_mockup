package com.example.appmockupdesign.mainManu

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.roofscrew.RoofScrew
import com.example.appmockupdesign.service.Service
import com.example.appmockupdesign.transport.Transport
import com.example.appmockupdesign.warranty.Warranty


class MainMainViewModel : ViewModel(){

    fun goToRoof(context: MainManu){
        context.startActivity(Intent(context, RoofScrew::class.java))
    }
    fun goToWarranty(context: MainManu){
        context.startActivity(Intent(context, Warranty::class.java))
    }
    fun goToService(context: MainManu) {
        context.startActivity(Intent(context, Service::class.java))
    }
    fun goToTransport(context: MainManu){
        context.startActivity((Intent(context, Transport::class.java)))
    }
}