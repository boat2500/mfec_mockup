package com.example.appmockupdesign.catalogue

import android.graphics.Insets.add
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.appmockupdesign.R
import com.example.appmockupdesign.home.HomeViewModel

class catalogueViewModel: ViewModel(){

    private lateinit var viewModel: HomeViewModel

    fun add_catalogue(catalogoeData: ArrayList<catalogoeData>){
       catalogoeData.apply {
           add(catalogoeData(R.drawable.mask_group10, "รวม VN steel"))
           add(catalogoeData(R.drawable.mask_group11, "VICTORY AUTOMETIC ROLLER DOOR"))
           add(catalogoeData(R.drawable.mask_group12, "UNION STEEL by DONGKUK STEEL"))
           add(catalogoeData(R.drawable.mask_group13, "SKY PRODUCT : PRODUCT PROFILE"))
           add(catalogoeData(R.drawable.mask_group14, "SKY PRODUCT : NORDIC COPPER"))
           add(catalogoeData(R.drawable.mask_group15, "LUXTEEL"))
       }
    }
}