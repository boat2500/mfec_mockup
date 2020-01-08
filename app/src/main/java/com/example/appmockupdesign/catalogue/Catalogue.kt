package com.example.appmockupdesign.catalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_catalogue.*

class Catalogue : AppCompatActivity() {
    var catalogueData = ArrayList<catalogoeData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)

        catalogRecycle.adapter =
            catalogueAdapter(
                catalogueData
            )
        catalogRecycle.layoutManager = LinearLayoutManager(this)
    }
}
