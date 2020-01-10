package com.example.appmockupdesign.catalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.roofscrew.bluescope.BlueScope.bluescopeViewModel
import kotlinx.android.synthetic.main.activity_catalogue.*

class Catalogue : AppCompatActivity() {
    var catalogueData = ArrayList<catalogoeData>()
    private lateinit var viewModel: catalogueViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)
        supportActionBar?.setTitle("Catalog")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        viewModel = ViewModelProviders.of(this).get(catalogueViewModel::class.java)
        viewModel.add_catalogue(catalogueData)

        catalogRecycle.adapter =
            catalogueAdapter(
                catalogueData,
                this
            )
        catalogRecycle.layoutManager = LinearLayoutManager(this)
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
