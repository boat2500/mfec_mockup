package com.example.appmockupdesign.roofscrew.dongkukSteel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.app.NotificationCompat
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_dongkuk_steel_detail.*
import kotlinx.android.synthetic.main.activity_dongkuk_steel_detail.spinner
import kotlinx.android.synthetic.main.activity_vitory_detail.*

class DongkukSteelDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dongkuk_steel_detail)
        supportActionBar?.setTitle(R.string.warrantyDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y = (Integer.parseInt(textView67.text.toString()))


        val xyz = arrayOf("1","2","3","4")
        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, xyz)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
            }
        }

        textView64.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {}
            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int) {
                if (textView64.text.toString()!=""){
                    price(y)
                }
            }
        })


        button7.setOnClickListener(){
            upTitle()
        }
        button6.setOnClickListener(){
            downTitle()
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

    fun upTitle(){
        textView64.setText((Integer.parseInt(textView64.text.toString())+1).toString())
    }
    fun downTitle(){
        if(Integer.parseInt((textView64.text.toString())) >0)
        textView64.setText((Integer.parseInt(textView64.text.toString())-1).toString())
    }
    fun price(y:Int){
        var x = (Integer.parseInt(textView64.text.toString()))
        textView67.setText((x*y).toString())
    }

}
