package com.example.appmockupdesign.victory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.appmockupdesign.R
import com.example.appmockupdesign.victory.victoryBlue.victoryBlue
import com.example.appmockupdesign.victory.victory_luxteel.Victory_luxteel
import kotlinx.android.synthetic.main.activity_victory.*
import kotlinx.android.synthetic.main.activity_victory_luxteel.*

class Victory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)
        supportActionBar?.setTitle("VICTORY")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imageView41.setOnClickListener(){
            startActivity(Intent(this, victoryBlue::class.java))
        }
        imageView42.setOnClickListener(){
            startActivity(Intent(this, Victory_luxteel::class.java))
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
