package com.example.appmockupdesign.catalogue

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_catalogue_adapter.view.*

class catalogueAdapter(var item: ArrayList<catalogoeData>,var context: Context):RecyclerView.Adapter<ViewHoder_catalogue>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder_catalogue {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_catalogue_adapter, parent, false)
        return ViewHoder_catalogue(view)
    }

    override fun getItemCount(): Int =item.size

    override fun onBindViewHolder(holder: ViewHoder_catalogue, position: Int) {
        holder.book.setImageResource(item[position].image)
        holder.bookName.text = item[position].name

        holder.layout.setOnClickListener(){
            Log.i("25001",item[position].toString())
            val intent = Intent(context, PDF::class.java)
            intent.putExtra("pdfName", item[position].image.toString())
            it.context.startActivity(intent)
        }
    }

}

class ViewHoder_catalogue(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    var book = ItemView.imageView32
    var bookName = ItemView.textView37
    var layout = ItemView.catalogueLayout
}
