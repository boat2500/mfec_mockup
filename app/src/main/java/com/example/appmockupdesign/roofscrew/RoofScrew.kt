package com.example.appmockupdesign.roofscrew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.app.NotificationCompat.EXTRA_PEOPLE
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.bluescope.BlueScope.BlueScope
import com.example.appmockupdesign.roofscrew.dongkukSteel.DongkuSteel
import com.example.appmockupdesign.roofscrew.luxteel.Luxteel
import com.example.appmockupdesign.roofscrew.translucentRoofing.Translucent
import com.example.appmockupdesign.roofscrew.victoryScrew.VitoryScrew
import kotlinx.android.synthetic.main.activity_roof_screw.*
import kotlinx.android.synthetic.main.activity_translucent.*

class RoofScrew : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roof_screw)
        supportActionBar?.setTitle(R.string.roof_screw)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imageView14.setOnClickListener(){
            val intent = Intent(this, BlueScope::class.java)
            intent.putExtra(EXTRA_PEOPLE, "1")
            startActivity(Intent(intent))
        }
        imageView15.setOnClickListener(){
            startActivity(Intent(this,Luxteel::class.java))
        }
        imageView16.setOnClickListener(){
            startActivity(Intent(this,DongkuSteel::class.java))
        }
        imageView17.setOnClickListener(){
            startActivity(Intent(this, VitoryScrew::class.java))
        }
        imageView18.setOnClickListener(){
            startActivity(Intent(this, Translucent::class.java))
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
