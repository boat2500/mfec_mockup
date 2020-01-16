package com.example.appmockupdesign.sky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.appmockupdesign.R
import com.example.appmockupdesign.sky.nordic_copper.Nordic_copper
import com.example.appmockupdesign.sky.product_profile.Product_profile
import com.example.appmockupdesign.sky.sky_luxteel.Sky_luxteel
import com.example.appmockupdesign.sky.steel_builder.Steel_builder
import kotlinx.android.synthetic.main.activity_sky.*
import kotlinx.android.synthetic.main.activity_victory.*

class Sky : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sky)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imageView43.setOnClickListener(){
            startActivity(Intent(this, Nordic_copper::class.java))
        }
        imageView44.setOnClickListener(){
            startActivity(Intent(this, Sky_luxteel::class.java))
        }
        imageView45.setOnClickListener(){
            startActivity(Intent(this, Steel_builder::class.java))
        }
        imageView48.setOnClickListener(){
            startActivity(Intent(this, Product_profile::class.java))
        }

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
