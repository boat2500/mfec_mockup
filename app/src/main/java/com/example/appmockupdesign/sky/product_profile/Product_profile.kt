package com.example.appmockupdesign.sky.product_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.sky.skyAdapter
import com.example.appmockupdesign.sky.skyData
import kotlinx.android.synthetic.main.activity_product_profile.*

class Product_profile : AppCompatActivity() {

    var skyData = ArrayList<skyData>()
    private lateinit var viewModel: product_profileViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_profile)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(product_profileViewModel::class.java)

        viewModel.product_profile_add(skyData)

        product_profileRecycle.adapter =
            skyAdapter(
                skyData
            )
        product_profileRecycle.layoutManager = GridLayoutManager(this, 3)


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
