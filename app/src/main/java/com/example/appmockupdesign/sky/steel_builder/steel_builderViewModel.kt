package com.example.appmockupdesign.sky.steel_builder

import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.R
import com.example.appmockupdesign.sky.skyData

class steel_builderViewModel:ViewModel(){
    fun steel_builder_add(skyData: ArrayList<skyData>) {
        skyData.apply {
            add(skyData("ASIAN WHITE", R.drawable.rectangle1000))
            add(skyData("PEANUT BUTTER", R.drawable.rectangle1001))
            add(skyData("NUVO BLUE", R.drawable.rectangle1002))
            add(skyData("BRIGHT GREEN", R.drawable.rectangle1003))
            add(skyData("CITRUS ORANGE", R.drawable.rectangle1004))
            add(skyData("HG TIGER RED", R.drawable.rectangle1005))
            add(skyData("CASTLE RED", R.drawable.rectangle1006))
            add(skyData("NATURAL BROWN", R.drawable.rectangle1007))
            add(skyData("SHAMPOO BLUE", R.drawable.rectangle1008))
            add(skyData("ALMIGHTY VIOLET", R.drawable.rectangle1009))
            add(skyData("BANANA LEAF", R.drawable.rectangle1010))
            add(skyData("BAITONG GREEN", R.drawable.rectangle1011))
            add(skyData("LEMON GREEN", R.drawable.rectangle1012))
            add(skyData("BANGCHAK GREEN", R.drawable.rectangle1013))
            add(skyData("MG YELLOW", R.drawable.rectangle1014))
            add(skyData("BRICK ORANGE", R.drawable.rectangle1015))
        }
    }

}