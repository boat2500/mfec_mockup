package com.example.appmockupdesign.mainManu

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.catalogue.Catalogue
import com.example.appmockupdesign.galvanized.Galvanized
import com.example.appmockupdesign.roofscrew.RoofScrew
import com.example.appmockupdesign.service.Service
import com.example.appmockupdesign.sky.Sky
import com.example.appmockupdesign.transport.Transport
import com.example.appmockupdesign.victory.Victory
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
    fun goToCatalogue(context: MainManu){
        context.startActivity((Intent(context, Catalogue::class.java)))
    }
    fun goTogalvanized(context: MainManu){
        context.startActivity((Intent(context, Galvanized::class.java)))
    }
    fun goToVictory(context: MainManu){
        context.startActivity((Intent(context, Victory::class.java)))
    }
    fun goToSky(context: MainManu){
        context.startActivity((Intent(context, Sky::class.java)))
    }
}