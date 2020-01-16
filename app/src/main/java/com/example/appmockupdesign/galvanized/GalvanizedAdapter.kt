package com.example.appmockupdesign.galvanized

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.luxleel_adapter.view.*

class GalvanizedAdapter (var item: ArrayList<GalvanizedData>):RecyclerView.Adapter<ViewHolder_Galvanized>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder_Galvanized {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.luxleel_adapter,parent,false)
        return ViewHolder_Galvanized(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHolder_Galvanized, position: Int) {
        holder.image.setImageResource(item[position].image)
        holder.name.text = item[position].name
    }

}

class ViewHolder_Galvanized(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var image = ItemView.imageView20
    var name = ItemView.textView38
}
