package com.example.appmockupdesign.sky.steel_builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.sky.skyAdapter
import com.example.appmockupdesign.sky.skyData
import com.example.appmockupdesign.sky.sky_luxteel.skyluxteelViewModel
import kotlinx.android.synthetic.main.activity_steel_builder.*

class Steel_builder : AppCompatActivity() {

    var skyData = ArrayList<skyData>()
    private lateinit var viewModel: steel_builderViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steel_builder)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(steel_builderViewModel::class.java)

        viewModel.steel_builder_add(skyData)

        steel_builderRecycle.adapter =
            skyAdapter(
                skyData
            )
        steel_builderRecycle.layoutManager = GridLayoutManager(this, 3)


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
