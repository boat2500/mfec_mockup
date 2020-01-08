package com.example.appmockupdesign.transport

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.transport_adapter.view.*

class transportAdapter(var item: ArrayList<transportData>):RecyclerView.Adapter<ViewHoder_transport>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder_transport {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.transport_adapter, parent, false)
        return ViewHoder_transport(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHoder_transport, position: Int) {
        holder.tranKg.text = item[position].kg
        holder.tranPrice.text = "%,d".format(item[position].price)
    }

}

class ViewHoder_transport(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var tranKg = ItemView.textView35
    var tranPrice = ItemView.textView36
}
