package com.example.appmockupdesign.roofscrew.translucentRoofing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_translucent.*
import kotlinx.android.synthetic.main.activity_translucent_detail.*
import kotlinx.android.synthetic.main.activity_vitory_detail.*

class translucentDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translucent_detail)
        supportActionBar?.setTitle(R.string.warrantyDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(
            translutextView14.text.toString()
        ))

        button13.setOnClickListener() {
            downTitle()
            price(y)
        }
        button14.setOnClickListener() {
            upTitle()
            price(y)
        }

        translutextView12.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (translutextView12.text.toString() != "") {
                    price(y)
                }
            }
        })


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var manuAction = menuInflater.inflate(R.menu.main_manu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    fun upTitle() {
        translutextView12.setText((Integer.parseInt(translutextView12.text.toString()) + 1).toString())
    }

    fun downTitle() {
        if (Integer.parseInt((translutextView12.text.toString())) > 1)
            translutextView12.setText((Integer.parseInt(translutextView12.text.toString()) - 1).toString())
    }

    fun price(y: Int) {
        var x = (Integer.parseInt(translutextView12.text.toString()))
        translutextView14.setText((x * y).toString())
    }
}
