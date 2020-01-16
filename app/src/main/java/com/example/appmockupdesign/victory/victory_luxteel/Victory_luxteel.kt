package com.example.appmockupdesign.victory.victory_luxteel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import com.example.appmockupdesign.victory.victoryAdapter
import com.example.appmockupdesign.victory.victoryBlue.VictoryViewModel
import com.example.appmockupdesign.victory.victoryData
import kotlinx.android.synthetic.main.activity_victory_luxteel.*

class Victory_luxteel : AppCompatActivity() {

    var victoryData = ArrayList<victoryData>()
    private lateinit var viewModel: VictoryViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory_luxteel)
        supportActionBar?.setTitle("VICTORY")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(VictoryViewModel::class.java)

        viewModel.victoryBlue_add(victoryData)

        victory_lueteelRecycle.adapter =
            victoryAdapter(
                victoryData
            )
        victory_lueteelRecycle.layoutManager = GridLayoutManager(this, 3)


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
