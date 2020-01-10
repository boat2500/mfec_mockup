package com.example.appmockupdesign.transport.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.transport.*
import kotlinx.android.synthetic.main.fragment_transport.*
import kotlinx.android.synthetic.main.fragment_transport1.*

class PlaceholderFragment2 : Fragment() {

    private lateinit var viewModel: transportViewModel
    var transportData2 = ArrayList<transportData2>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_transport1, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        transportData2.clear()
        transportRecyclex?.adapter?.notifyDataSetChanged()

        transportData2.apply {
            add(transportData2("   1-50    ", 2100))
            add(transportData2("  51-100", 2700))
            add(transportData2("101-150", 3400))
            add(transportData2("150-200", 4000))
            add(transportData2("201-250", 4700))
            add(transportData2("251-300", 5300))
            add(transportData2("301-350", 5900))
            add(transportData2("351-400", 6600))
            add(transportData2("401-450", 7200))
            add(transportData2("451-500", 8500))
            add(transportData2("501-550", 9000))
            add(transportData2("551-600", 9700))
            add(transportData2(" 601-650 ", 10400))
            add(transportData2(" 651-700 ", 11200))
            add(transportData2(" 701-750 ", 11900))
            add(transportData2(" 751-800 ", 12700))
        }
        transportRecyclex.adapter =
            transportAdapter1(
                transportData2
            )
        transportRecyclex.layoutManager = LinearLayoutManager(context)
    }
}