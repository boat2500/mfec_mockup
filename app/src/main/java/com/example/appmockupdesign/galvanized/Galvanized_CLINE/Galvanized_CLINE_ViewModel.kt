package com.example.appmockupdesign.galvanized.Galvanized_CLINE

import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.R
import com.example.appmockupdesign.galvanized.GalvanizedData

class Galvanized_CLINE_ViewModel :ViewModel(){

    fun Galvanized_CLINE_add(CLINE: ArrayList<GalvanizedData>) {
        CLINE.apply {
            add(GalvanizedData("ASIAN WHITE", R.drawable.rectangle1000))
            add(GalvanizedData("PEANUT BUTTER", R.drawable.rectangle1001))
            add(GalvanizedData("NUVO BLUE", R.drawable.rectangle1002))
            add(GalvanizedData("BRIGHT GREEN", R.drawable.rectangle1003))
            add(GalvanizedData("CITRUS ORANGE", R.drawable.rectangle1004))
            add(GalvanizedData("HG TIGER RED", R.drawable.rectangle1005))
            add(GalvanizedData("CASTLE RED", R.drawable.rectangle1006))
            add(GalvanizedData("NATURAL BROWN", R.drawable.rectangle1007))
            add(GalvanizedData("SHAMPOO BLUE", R.drawable.rectangle1008))
            add(GalvanizedData("ALMIGHTY VIOLET", R.drawable.rectangle1009))
            add(GalvanizedData("BANANA LEAF", R.drawable.rectangle1010))
            add(GalvanizedData("BAITONG GREEN", R.drawable.rectangle1011))
            add(GalvanizedData("LEMON GREEN", R.drawable.rectangle1012))
            add(GalvanizedData("BANGCHAK GREEN", R.drawable.rectangle1013))
            add(GalvanizedData("MG YELLOW", R.drawable.rectangle1014))
            add(GalvanizedData("BRICK ORANGE", R.drawable.rectangle1015))
        }
    }
}
