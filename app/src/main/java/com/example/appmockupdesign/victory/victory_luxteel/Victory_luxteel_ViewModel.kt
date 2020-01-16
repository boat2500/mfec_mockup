package com.example.appmockupdesign.victory.victory_luxteel

import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.R
import com.example.appmockupdesign.victory.victoryData

class Victory_luxteel_ViewModel : ViewModel(){

    fun victory_luxteel_add(victoryData: ArrayList<victoryData>) {
        victoryData.apply {
            add(victoryData("ASIAN WHITE", R.drawable.rectangle1000))
            add(victoryData("PEANUT BUTTER", R.drawable.rectangle1001))
            add(victoryData("NUVO BLUE", R.drawable.rectangle1002))
            add(victoryData("BRIGHT GREEN", R.drawable.rectangle1003))
            add(victoryData("CITRUS ORANGE", R.drawable.rectangle1004))
            add(victoryData("HG TIGER RED", R.drawable.rectangle1005))
            add(victoryData("CASTLE RED", R.drawable.rectangle1006))
            add(victoryData("NATURAL BROWN", R.drawable.rectangle1007))
            add(victoryData("SHAMPOO BLUE", R.drawable.rectangle1008))
            add(victoryData("ALMIGHTY VIOLET", R.drawable.rectangle1009))
            add(victoryData("BANANA LEAF", R.drawable.rectangle1010))
            add(victoryData("BAITONG GREEN", R.drawable.rectangle1011))
            add(victoryData("LEMON GREEN", R.drawable.rectangle1012))
            add(victoryData("BANGCHAK GREEN", R.drawable.rectangle1013))
            add(victoryData("MG YELLOW", R.drawable.rectangle1014))
            add(victoryData("BRICK ORANGE", R.drawable.rectangle1015))
        }
    }

}