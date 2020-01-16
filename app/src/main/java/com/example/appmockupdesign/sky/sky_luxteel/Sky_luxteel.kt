package com.example.appmockupdesign.sky.sky_luxteel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.sky.skyAdapter
import com.example.appmockupdesign.sky.skyData
import kotlinx.android.synthetic.main.activity_sky_luxteel.*

class Sky_luxteel : AppCompatActivity() {

    var skyData = ArrayList<skyData>()
    private lateinit var viewModel: skyluxteelViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sky_luxteel)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(skyluxteelViewModel::class.java)

        viewModel.skyluxteel_add(skyData)

        sky_luxteelRecycle.adapter =
            skyAdapter(
                skyData
            )
        sky_luxteelRecycle.layoutManager = GridLayoutManager(this, 3)


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
