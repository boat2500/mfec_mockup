package com.example.appmockupdesign.victory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.luxleel_adapter.view.*

class victoryAdapter(var item: ArrayList<victoryData>):RecyclerView.Adapter<ViewHolder_Victory>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder_Victory {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.luxleel_adapter,parent,false)
        return ViewHolder_Victory(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHolder_Victory, position: Int) {
        holder.image.setImageResource(item[position].image)
        holder.name.text = item[position].name
    }

}

class ViewHolder_Victory(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var image = ItemView.imageView20
    var name = ItemView.textView38

}
