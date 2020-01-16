package com.example.appmockupdesign.galvanized

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_channel__square__detail.*
import kotlinx.android.synthetic.main.activity_translucent_detail.*
import kotlinx.android.synthetic.main.activity_vitory_detail.*

class CHANNEL_SQUARE_Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_channel__square__detail)
        supportActionBar?.setTitle(R.string.warrantyDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(
            ChanneltextView13.text.toString()
        ))

        button20.setOnClickListener() {
            downTitle()
            price(y)
        }
        button21.setOnClickListener() {
            upTitle()
            price(y)
        }

        ChanneltextView11.addTextChangedListener(object : TextWatcher {

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
                if (ChanneltextView11.text.toString() != "") {
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
        ChanneltextView11.setText((Integer.parseInt(ChanneltextView11.text.toString()) + 1).toString())
    }

    fun downTitle() {
        if (Integer.parseInt((ChanneltextView11.text.toString())) > 1)
            ChanneltextView11.setText((Integer.parseInt(ChanneltextView11.text.toString()) - 1).toString())
    }

    fun price(y: Int) {
        var x = (Integer.parseInt(ChanneltextView11.text.toString()))
        ChanneltextView13.setText((x * y).toString())
    }

}
