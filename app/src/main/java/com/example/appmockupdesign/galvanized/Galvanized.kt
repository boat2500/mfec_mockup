package com.example.appmockupdesign.galvanized

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.appmockupdesign.R
import com.example.appmockupdesign.galvanized.Galvanized_CHANNEL.Galvanized_CHANNEL
import com.example.appmockupdesign.galvanized.Galvanized_CLINE.Galvanized_CLINE
import com.example.appmockupdesign.galvanized.Galvanized_CPAC.Galvanized_CPAC
import com.example.appmockupdesign.galvanized.Galvanized_SQUARE.Galvanized_SQUARE
import kotlinx.android.synthetic.main.activity_galvanized.*

class Galvanized : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galvanized)
        supportActionBar?.setTitle(R.string.galvanized)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imageView35.setOnClickListener(){
            startActivity(Intent(this, Galvanized_CPAC::class.java))
        }
        imageView36.setOnClickListener(){
            startActivity(Intent(this, Galvanized_CLINE::class.java))
        }
        imageView37.setOnClickListener(){
            startActivity(Intent(this, Galvanized_CHANNEL::class.java))
        }
        imageView38.setOnClickListener(){
            startActivity(Intent(this, Galvanized_SQUARE::class.java))
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
