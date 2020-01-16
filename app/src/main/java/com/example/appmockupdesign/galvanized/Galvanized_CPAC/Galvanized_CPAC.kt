package com.example.appmockupdesign.galvanized.Galvanized_CPAC

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.galvanized.CLINE_CPAC_Detail
import com.example.appmockupdesign.galvanized.GalvanizedAdapter
import com.example.appmockupdesign.galvanized.GalvanizedData
import com.example.appmockupdesign.galvanized.Galvanized_CLINE.Galvanized_CLINE_ViewModel
import kotlinx.android.synthetic.main.activity_galvanized__cpac.*

class Galvanized_CPAC : AppCompatActivity() {

    var GalvanizedData = ArrayList<GalvanizedData>()
    private lateinit var viewModel: Galvanized_CLINE_ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galvanized__cpac)
        supportActionBar?.setTitle("เหล็กกัลวาไนซ์")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(Galvanized_CLINE_ViewModel::class.java)

        viewModel.Galvanized_CLINE_add(GalvanizedData)

        galvanizedRecycleView.adapter =
            GalvanizedAdapter(
                GalvanizedData
            )
        galvanizedRecycleView.layoutManager = GridLayoutManager(this, 3)

        button17.setOnClickListener(){
            startActivity(Intent(this, CLINE_CPAC_Detail::class.java))
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
