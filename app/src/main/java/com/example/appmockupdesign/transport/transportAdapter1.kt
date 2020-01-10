package com.example.appmockupdesign.transport

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.transport_adapter.view.*

class transportAdapter1(var item: ArrayList<transportData2>):RecyclerView.Adapter<ViewHoder_transport1>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder_transport1 {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.transport_adapter, parent, false)
        return ViewHoder_transport1(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHoder_transport1, position: Int) {
        holder.tranKg.text = item[position].kg
        holder.tranPrice.text = "%,d".format(item[position].price)
    }

}

class ViewHoder_transport1(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var tranKg = ItemView.textView35
    var tranPrice = ItemView.textView36
}
