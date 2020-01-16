package com.example.appmockupdesign.sky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_sky2.*

class sky2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sky2)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(
            sky2textView13.text.toString()
        ))


        button31.setOnClickListener() {
            downTitle()
            price(y)
        }
        button32.setOnClickListener() {
            upTitle()
            price(y)
        }

        sky2textView11.addTextChangedListener(object : TextWatcher {

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
                if (sky2textView11.text.toString() != "") {
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
        sky2textView11.setText((Integer.parseInt(sky2textView11.text.toString()) + 1).toString())
    }

    fun downTitle() {
        if (Integer.parseInt((sky2textView11.text.toString())) > 1)
            sky2textView11.setText((Integer.parseInt(sky2textView11.text.toString()) - 1).toString())
    }

    fun price(y: Int) {
        var x = (Integer.parseInt(sky2textView11.text.toString()))
        sky2textView13.setText((x * y).toString())
    }
}
