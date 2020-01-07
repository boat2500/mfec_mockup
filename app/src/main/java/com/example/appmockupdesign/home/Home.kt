package com.example.appmockupdesign.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.home.*

class Home : AppCompatActivity() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        supportActionBar?.hide()

        //imageView2.visibility = View.GONE
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        viewModel.changLogo(this)
        viewModel.openHomePage(this)

        manuBT.setOnClickListener(){
            viewModel.goToMainManu(this)
        }

        imageView8.setOnClickListener(){
            viewModel.goTocontaxt(this)
        }
    }
}
