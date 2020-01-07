package com.example.appmockupdesign.roofscrew.bluescope.BlueScope

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.appmockupdesign.R

class bluescopeViewModel: ViewModel(){

    fun addBluescope(context: Context, blueData: ArrayList<bluescopeData>){
        blueData.apply {
            add(bluescopeData("ASIAN WHITE", R.drawable.rectangle1000))
            add(bluescopeData("PEANUT BUTTER", R.drawable.rectangle1001))
            add(bluescopeData("NUVO BLUE", R.drawable.rectangle1002))
            add(bluescopeData("BRIGHT GREEN", R.drawable.rectangle1003))
            add(bluescopeData("CITRUS ORANGE", R.drawable.rectangle1004))
            add(bluescopeData("HG TIGER RED", R.drawable.rectangle1005))
            add(bluescopeData("CASTLE RED", R.drawable.rectangle1006))
            add(bluescopeData("NATURAL BROWN", R.drawable.rectangle1007))
            add(bluescopeData("SHAMPOO BLUE", R.drawable.rectangle1008))
            add(bluescopeData("ALMIGHTY VIOLET", R.drawable.rectangle1009))
            add(bluescopeData("BANANA LEAF", R.drawable.rectangle1010))
            add(bluescopeData("BAITONG GREEN", R.drawable.rectangle1011))
            add(bluescopeData("LEMON GREEN", R.drawable.rectangle1012))
            add(bluescopeData("BANGCHAK GREEN", R.drawable.rectangle1013))
            add(bluescopeData("MG YELLOW", R.drawable.rectangle1014))
            add(bluescopeData("BRICK ORANGE", R.drawable.rectangle1015))
        }
    }
}