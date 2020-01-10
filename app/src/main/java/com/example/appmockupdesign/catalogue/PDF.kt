package com.example.appmockupdesign.catalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_pdf.*

class PDF : AppCompatActivity() {

    var pdf = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
        supportActionBar?.setTitle("Catalog")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        pdf = intent.getStringExtra("pdfName")

        when(pdf){
            "2131165335" -> pdfView.fromAsset("VN_Steel.pdf").load()
            "2131165336" -> pdfView.fromAsset("VICTORY_AUTOMETIC_ROLLER_DOOR.pdf").load()
            "2131165337" -> pdfView.fromAsset("UNION_STEEL_BY_DONGKUK_STEEL.pdf").load()
            "2131165338" -> pdfView.fromAsset("SKY_PRODUCE_(PRODUCT_PROFILE).pdf").load()
            "2131165339" -> pdfView.fromAsset("SKY_PRODUCT_(NORDIC_COPPER).pdf").load()
            "2131165340" -> pdfView.fromAsset("LUXTEEL.pdf").load()
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
