package com.example.appmockupdesign.roofscrew.translucentRoofing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.RoofScrewAdapter
import com.example.appmockupdesign.roofscrew.RoofScrewData
import com.example.appmockupdesign.roofscrew.victoryScrew.vitoryScrewViewModel
import kotlinx.android.synthetic.main.activity_translucent.*
import kotlinx.android.synthetic.main.activity_vitory_screw.*

class Translucent : AppCompatActivity() {

    var translucentData = ArrayList<RoofScrewData>()
    private lateinit var viewModel: translucentViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translucent)
        supportActionBar?.setTitle(R.string.roof_screw)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(translucentViewModel::class.java)
        viewModel.addvitoryScrew(this, translucentData)

        translucentRecyclerView.adapter = RoofScrewAdapter(
            translucentData
        )
        translucentRecyclerView.layoutManager = GridLayoutManager(this, 3)

        button12.setOnClickListener(){
            startActivity(Intent(this, translucentDetail::class.java))
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
