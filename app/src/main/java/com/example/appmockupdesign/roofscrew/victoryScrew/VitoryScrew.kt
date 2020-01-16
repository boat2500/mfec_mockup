package com.example.appmockupdesign.roofscrew.victoryScrew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.RoofScrewAdapter
import com.example.appmockupdesign.roofscrew.RoofScrewData
import kotlinx.android.synthetic.main.activity_vitory_screw.*

class VitoryScrew : AppCompatActivity() {

    var vitoryScrewData = ArrayList<RoofScrewData>()
    private lateinit var viewModel: vitoryScrewViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vitory_screw)
        supportActionBar?.setTitle(R.string.roof_screw)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewModel = ViewModelProviders.of(this).get(vitoryScrewViewModel::class.java)

        viewModel.addvitoryScrew(this, vitoryScrewData)

        vitoryRecycleView.adapter =
            RoofScrewAdapter(
                vitoryScrewData
            )
        vitoryRecycleView.layoutManager = GridLayoutManager(this, 3)

        button1.setOnClickListener(){
            viewModel.goToDetail(this)
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
