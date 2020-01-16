package com.example.appmockupdesign.roofscrew.victoryScrew

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.RoofScrewData

class vitoryScrewViewModel: ViewModel(){

    fun addvitoryScrew(context: Context, vitoryScrewData: ArrayList<RoofScrewData>){
        vitoryScrewData.apply {
            add(RoofScrewData("ASIAN WHITE", R.drawable.rectangle1000))
            add(RoofScrewData("PEANUT BUTTER", R.drawable.rectangle1001))
            add(RoofScrewData("NUVO BLUE", R.drawable.rectangle1002))
            add(RoofScrewData("BRIGHT GREEN", R.drawable.rectangle1003))
            add(RoofScrewData("CITRUS ORANGE", R.drawable.rectangle1004))
            add(RoofScrewData("HG TIGER RED", R.drawable.rectangle1005))
            add(RoofScrewData("CASTLE RED", R.drawable.rectangle1006))
            add(RoofScrewData("NATURAL BROWN", R.drawable.rectangle1007))
            add(RoofScrewData("SHAMPOO BLUE", R.drawable.rectangle1008))
            add(RoofScrewData("ALMIGHTY VIOLET", R.drawable.rectangle1009))
            add(RoofScrewData("BANANA LEAF", R.drawable.rectangle1010))
            add(RoofScrewData("BAITONG GREEN", R.drawable.rectangle1011))
            add(RoofScrewData("LEMON GREEN", R.drawable.rectangle1012))
            add(RoofScrewData("BANGCHAK GREEN", R.drawable.rectangle1013))
            add(RoofScrewData("MG YELLOW", R.drawable.rectangle1014))
            add(RoofScrewData("BRICK ORANGE", R.drawable.rectangle1015))
        }
    }
    fun goToDetail(context: Context){
        context.startActivity(Intent(context, VitoryDetail::class.java))
    }

}