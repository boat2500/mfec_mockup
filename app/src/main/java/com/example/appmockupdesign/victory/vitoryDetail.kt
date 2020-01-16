package com.example.appmockupdesign.victory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_vitory_detail2.*

class vitoryDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vitory_detail2)
        supportActionBar?.setTitle("SKY PRODUCT")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(
            victorytextView12.text.toString()
        ))


        button33.setOnClickListener() {
            downTitle()
            price(y)
        }
        button34.setOnClickListener() {
            upTitle()
            price(y)
        }

        victorytextView10.addTextChangedListener(object : TextWatcher {

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
                if (victorytextView10.text.toString() != "") {
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
        victorytextView10.setText((Integer.parseInt(victorytextView10.text.toString()) + 1).toString())
    }

    fun downTitle() {
        if (Integer.parseInt((victorytextView10.text.toString())) > 1)
            victorytextView10.setText((Integer.parseInt(victorytextView10.text.toString()) - 1).toString())
    }

    fun price(y: Int) {
        var x = (Integer.parseInt(victorytextView10.text.toString()))
        victorytextView12.setText((x * y).toString())
    }
}
