package com.example.appmockupdesign.sky

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.luxleel_adapter.view.*

class skyAdapter(var item: ArrayList<skyData>):RecyclerView.Adapter<ViewModel_sky>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewModel_sky {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.luxleel_adapter, parent, false)
        return ViewModel_sky(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewModel_sky, position: Int) {
        holder.image.setImageResource(item[position].image)
        holder.name.text = item[position].name
    }
}

class ViewModel_sky(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var image = ItemView.imageView20
    var name = ItemView.textView38

}
