package com.example.appmockupdesign.mainManu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.appmockupdesign.R
import com.example.appmockupdesign.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_warranty.*
import kotlinx.android.synthetic.main.main_manu.*

class MainManu : AppCompatActivity() {

    private lateinit var viewModel: MainMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_manu)
        supportActionBar?.setTitle(R.string.main_manu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(MainMainViewModel::class.java)

        roofAndScrew.setOnClickListener(){
            viewModel.goToRoof(this)
        }

        warranty.setOnClickListener(){
            viewModel.goToWarranty(this)
        }

        imageView12.setOnClickListener(){
            viewModel.goToTransport(this)
        }

        imageView13.setOnClickListener(){
            viewModel.goToService(this)
        }
        imageView10.setOnClickListener(){
            viewModel.goToCatalogue(this)
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
