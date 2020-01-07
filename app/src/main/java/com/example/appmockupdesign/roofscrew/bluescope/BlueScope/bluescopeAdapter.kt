package com.example.appmockupdesign.roofscrew.bluescope.BlueScope

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.bluescope_adapter.view.*

class bluescopeAdapter(var item: ArrayList<bluescopeData>, var context: Context):RecyclerView.Adapter<ViewHolder_bluescope>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder_bluescope {
        var view = LayoutInflater.from(context).inflate(R.layout.bluescope_adapter, parent, false)
        return ViewHolder_bluescope(view)
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHolder_bluescope, position: Int) {
        holder.imageColor.setImageResource(item[position].image)
        holder.name.text = item[position].name
    }

}

class ViewHolder_bluescope(Item: View):RecyclerView.ViewHolder(Item) {
    var imageColor = Item.imageView19
    var name = Item.textView3
}
