package com.example.appmockupdesign.roofscrew.victoryScrew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_vitory_detail.*

class VitoryDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vitory_detail)
        supportActionBar?.setTitle(R.string.warrantyDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(
            vitorytextView14.text.toString()
        ))


        button9.setOnClickListener() {
            downTitle()
            price(y)
        }
        button10.setOnClickListener() {
            upTitle()
            price(y)
        }

        vitorytextView12.addTextChangedListener(object : TextWatcher {

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
                if (vitorytextView12.text.toString() != "") {
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
        vitorytextView12.setText((Integer.parseInt(vitorytextView12.text.toString()) + 1).toString())
    }

    fun downTitle() {
        if (Integer.parseInt((vitorytextView12.text.toString())) > 1)
            vitorytextView12.setText((Integer.parseInt(vitorytextView12.text.toString()) - 1).toString())
    }

    fun price(y: Int) {
        var x = (Integer.parseInt(vitorytextView12.text.toString()))
        vitorytextView14.setText((x * y).toString())
    }
}
