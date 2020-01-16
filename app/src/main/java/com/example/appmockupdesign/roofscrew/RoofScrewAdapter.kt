package com.example.appmockupdesign.roofscrew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.luxleel_adapter.view.*

class RoofScrewAdapter(var item:ArrayList<RoofScrewData>):RecyclerView.Adapter<ViewHoder_luxteel>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder_luxteel {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.luxleel_adapter, parent, false)
        return ViewHoder_luxteel(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHoder_luxteel, position: Int) {
        holder.imageColor.setImageResource(item[position].image)
        holder.textColor.text = item[position].name
    }

}

class ViewHoder_luxteel(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var imageColor = ItemView.imageView20
    var textColor = ItemView.textView38
}
