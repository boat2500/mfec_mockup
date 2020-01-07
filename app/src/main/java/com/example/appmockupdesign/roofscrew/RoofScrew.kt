package com.example.appmockupdesign.roofscrew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.app.NotificationCompat.EXTRA_PEOPLE
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.bluescope.BlueScope.BlueScope
import kotlinx.android.synthetic.main.activity_roof_screw.*

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
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
