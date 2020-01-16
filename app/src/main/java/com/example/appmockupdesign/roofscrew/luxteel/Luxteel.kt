package com.example.appmockupdesign.roofscrew.luxteel

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
import kotlinx.android.synthetic.main.activity_luxleel.*

class Luxteel : AppCompatActivity() {

    var luxteelData = ArrayList<RoofScrewData>()
    private lateinit var viewModel: LuxteelViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luxleel)
        supportActionBar?.setTitle(R.string.roof_screw)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val people = intent.getSerializableExtra(NotificationCompat.EXTRA_PEOPLE) as? String

        Log.i("25001", people.toString())

        viewModel = ViewModelProviders.of(this).get(LuxteelViewModel::class.java)

        viewModel.addluxteel(this, luxteelData)

        luxleelRecycleView.adapter =
            RoofScrewAdapter(
                luxteelData

            )
        luxleelRecycleView.layoutManager = GridLayoutManager(this, 3)

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
