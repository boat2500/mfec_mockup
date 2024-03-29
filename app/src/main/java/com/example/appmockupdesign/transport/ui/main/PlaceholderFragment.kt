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

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var viewModel: transportViewModel
    var transportData = ArrayList<transportData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_transport, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        transportData.clear()
        transportRecycle?.adapter?.notifyDataSetChanged()
        transportData.apply {
            add(transportData("   1-50    ", 1300))
            add(transportData("  51-100", 1900))
            add(transportData("101-150", 2400))
            add(transportData("150-200", 2900))
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
        transportRecycle.adapter =
            transportAdapter(
                transportData
            )
        transportRecycle.layoutManager = LinearLayoutManager(context)
    }
}