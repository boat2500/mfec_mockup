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
import kotlinx.android.synthetic.main.fragment_transport2.*

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment3 : Fragment() {

    private lateinit var viewModel: transportViewModel
    var transportData3 = ArrayList<transportData3>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_transport2, container, false)
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        transportData3.clear()
        transportRecycle?.adapter?.notifyDataSetChanged()
        transportData3.apply {
            add(transportData3("   1-50    ", 5900))
            add(transportData3("  51-100", 6500))
            add(transportData3("101-150", 7300))
            add(transportData3("150-200", 8200))
            add(transportData3(" 201-250 ", 10100))
            add(transportData3(" 251-300 ", 11800))
            add(transportData3(" 301-350 ", 14000))
            add(transportData3(" 351-400 ", 16100))
            add(transportData3(" 401-450 ", 19300))
            add(transportData3(" 451-500 ", 21400))
            add(transportData3(" 501-550 ", 22500))
            add(transportData3(" 551-600 ", 23600))
            add(transportData3(" 601-650 ", 24100))
            add(transportData3(" 651-700 ", 24700))
            add(transportData3(" 701-750 ", 25200))
            add(transportData3(" 751-800 ", 25700))
        }
        transportRecycley.adapter =
            transportAdapter2(
                transportData3
            )
        transportRecycley.layoutManager = LinearLayoutManager(context)
    }
}