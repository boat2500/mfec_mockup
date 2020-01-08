package com.example.appmockupdesign.warranty

import android.os.Bundle
import android.view.Menu
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.appmockupdesign.R
import com.example.appmockupdesign.warranty.ui.main.SectionsPagerAdapter

class Warranty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warranty)
        supportActionBar?.setTitle(R.string.Warranty)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager1)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
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