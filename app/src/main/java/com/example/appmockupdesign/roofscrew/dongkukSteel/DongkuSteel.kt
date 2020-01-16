package com.example.appmockupdesign.roofscrew.dongkukSteel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.core.app.NotificationCompat
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.RoofScrewAdapter
import com.example.appmockupdesign.roofscrew.RoofScrewData
import kotlinx.android.synthetic.main.activity_dongku_steel.*

class DongkuSteel : AppCompatActivity() {

    var dongData = ArrayList<RoofScrewData>()
    private lateinit var viewModel: dongSteelViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dongku_steel)
        supportActionBar?.setTitle(R.string.roof_screw)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val people = intent.getSerializableExtra(NotificationCompat.EXTRA_PEOPLE) as? String

        Log.i("25001", people.toString())

        viewModel = ViewModelProviders.of(this).get(dongSteelViewModel::class.java)

        viewModel.addDong(this, dongData)

        donfRecycle.adapter =
            RoofScrewAdapter(
                dongData
            )
        donfRecycle.layoutManager = GridLayoutManager(this, 3)

        button5.setOnClickListener(){
            viewModel.goTodetail(this,dongData)
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

