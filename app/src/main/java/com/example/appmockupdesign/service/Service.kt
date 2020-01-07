package com.example.appmockupdesign.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_service.*

class Service : AppCompatActivity() {

    private lateinit var viewModel: serviewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        supportActionBar?.setTitle("Service")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(serviewViewModel::class.java)


        imageView21.setOnClickListener(){
            textView25.visibility = View.GONE
            tranSport.visibility = View.GONE
            textView28.visibility = View.GONE
            textView29.visibility = View.GONE

            viewModel.training(trainingView)
        }
        imageView22.setOnClickListener(){
            trainingView.visibility = View.GONE
            tranSport.visibility = View.GONE
            textView28.visibility = View.GONE
            textView29.visibility = View.GONE
                viewModel.training1(textView25)
        }
        imageView23.setOnClickListener(){
            textView25.visibility = View.GONE
            trainingView.visibility = View.GONE
            textView28.visibility = View.GONE
            textView29.visibility = View.GONE
            viewModel.training(tranSport)
        }
        imageView24.setOnClickListener(){
            textView25.visibility = View.GONE
            trainingView.visibility = View.GONE
            textView29.visibility = View.GONE
            tranSport.visibility = View.GONE
            viewModel.training1(textView28)
        }
        imageView25.setOnClickListener(){
            textView25.visibility = View.GONE
            trainingView.visibility = View.GONE
            textView28.visibility = View.GONE
            tranSport.visibility = View.GONE
            viewModel.training1(textView29)
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
