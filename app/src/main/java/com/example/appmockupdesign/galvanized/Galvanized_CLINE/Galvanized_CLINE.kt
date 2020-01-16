package com.example.appmockupdesign.galvanized.Galvanized_CLINE

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
import com.example.appmockupdesign.galvanized.Galvanized_CPAC.Galvanized_CPAC_ViewModel
import kotlinx.android.synthetic.main.activity_galvanized__cline.*

class Galvanized_CLINE : AppCompatActivity() {

    var GalvanizedData = ArrayList<GalvanizedData>()
    private lateinit var viewModel: Galvanized_CPAC_ViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galvanized__cline)
        supportActionBar?.setTitle("เหล็กกัลวาไนซ์")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(Galvanized_CPAC_ViewModel::class.java)

        viewModel.Galvanized_CPAC_add(GalvanizedData)

        clineRecycle.adapter =
            GalvanizedAdapter(
                GalvanizedData
            )
        clineRecycle.layoutManager = GridLayoutManager(this, 3)

        button16.setOnClickListener(){
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
