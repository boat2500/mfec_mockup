package com.example.appmockupdesign.galvanized.Galvanized_CHANNEL

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.galvanized.CHANNEL_SQUARE_Detail
import com.example.appmockupdesign.galvanized.GalvanizedAdapter
import com.example.appmockupdesign.galvanized.GalvanizedData
import com.example.appmockupdesign.galvanized.Galvanized_CPAC.Galvanized_CPAC_ViewModel
import kotlinx.android.synthetic.main.activity_galvanized__channel.*
import kotlinx.android.synthetic.main.activity_galvanized__cline.*

class Galvanized_CHANNEL : AppCompatActivity() {

    var GalvanizedData = ArrayList<GalvanizedData>()
    private lateinit var viewModel: Galvanized_Channel_ViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galvanized__channel)
        supportActionBar?.setTitle(R.string.galvanized)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(Galvanized_Channel_ViewModel::class.java)

        viewModel.Galvanized_Channel_add(GalvanizedData)

        channelRecycle.adapter =
            GalvanizedAdapter(
                GalvanizedData
            )
        channelRecycle.layoutManager = GridLayoutManager(this, 3)

        button18.setOnClickListener(){
            startActivity(Intent(this, CHANNEL_SQUARE_Detail::class.java))
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
