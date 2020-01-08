package com.example.appmockupdesign.catalogue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R

class catalogueAdapter(var item: ArrayList<catalogoeData>):RecyclerView.Adapter<ViewHoder_catalogue>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder_catalogue {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_catalogue_adapter, parent, false)
        return ViewHoder_catalogue(view)
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ViewHoder_catalogue, position: Int) {
    }

}

class ViewHoder_catalogue(ItemView: View):RecyclerView.ViewHolder(ItemView) {

}
