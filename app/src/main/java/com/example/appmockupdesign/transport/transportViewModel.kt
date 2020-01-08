package com.example.appmockupdesign.transport

import androidx.lifecycle.ViewModel

class transportViewModel: ViewModel(){

    var transportData = ArrayList<transportData>()

    fun modelCarTyle1(){
        transportData.apply {
            add(transportData("1 - 50", 1300))
            add(transportData("51-100", 1900))
            add(transportData("101-150", 2400))
            add(transportData("150-200", 290))
            add(transportData("201-250", 3500))
            add(transportData("251-300", 4000))
            add(transportData("301-350", 4500))
            add(transportData("351-400", 5100))
            add(transportData("401-450", 5600))
            add(transportData("451-500", 6100))
            add(transportData("501-550", 6700))
            add(transportData("551-600", 7200))
            add(transportData("601-650", 7800))
            add(transportData("651-700", 8300))
            add(transportData("701-750", 8800))
            add(transportData("751-800", 9400))
        }
    }

}