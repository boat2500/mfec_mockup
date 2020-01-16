package com.example.appmockupdesign.sky.nordic_copper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.sky.skyAdapter
import com.example.appmockupdesign.sky.skyData
import kotlinx.android.synthetic.main.activity_nordic_copper.*

class Nordic_copper : AppCompatActivity() {

    var skyData = ArrayList<skyData>()
    private lateinit var viewModel: nordic_copper_ViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nordic_copper)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(nordic_copper_ViewModel::class.java)

        viewModel.Nordic_copper(skyData)

        Nordic_copperRecycle.adapter =
            skyAdapter(
                skyData
            )
        Nordic_copperRecycle.layoutManager = GridLayoutManager(this, 3)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var manuAction = menuInflater.inflate(R.menu.main_manu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}
