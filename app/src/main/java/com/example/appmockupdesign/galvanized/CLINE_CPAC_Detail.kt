package com.example.appmockupdesign.galvanized

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_channel__square__detail.*
import kotlinx.android.synthetic.main.activity_channel__square__detail.button20
import kotlinx.android.synthetic.main.activity_channel__square__detail.button21
import kotlinx.android.synthetic.main.activity_cline__cpac__detail.*

class CLINE_CPAC_Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cline__cpac__detail)
        supportActionBar?.setTitle(R.string.warrantyDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(
            cpactextView13.text.toString()
        ))

        button20.setOnClickListener() {
            downTitle()
            price(y)
        }
        button21.setOnClickListener() {
            upTitle()
            price(y)
        }

        cpactextView11.addTextChangedListener(object : TextWatcher {

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
                if (cpactextView11.text.toString() != "") {
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
        cpactextView11.setText((Integer.parseInt(cpactextView11.text.toString()) + 1).toString())
    }

    fun downTitle() {
        if (Integer.parseInt((cpactextView11.text.toString())) > 1)
            cpactextView11.setText((Integer.parseInt(cpactextView11.text.toString()) - 1).toString())
    }

    fun price(y: Int) {
        var x = (Integer.parseInt(cpactextView11.text.toString()))
        cpactextView13.setText((x * y).toString())
    }

}
