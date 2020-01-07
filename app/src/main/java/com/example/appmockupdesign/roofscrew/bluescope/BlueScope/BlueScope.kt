package com.example.appmockupdesign.roofscrew.bluescope.BlueScope

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat.EXTRA_PEOPLE
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appmockupdesign.R
import kotlinx.android.synthetic.main.activity_blue_scope.*


class BlueScope : AppCompatActivity() {

    var blueData = ArrayList<bluescopeData>()
    private lateinit var viewModel: bluescopeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blue_scope)
        supportActionBar?.setTitle(R.string.roof_screw)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val people = intent.getSerializableExtra(EXTRA_PEOPLE) as? String

        Log.i("25001", people.toString())

        viewModel = ViewModelProviders.of(this).get(bluescopeViewModel::class.java)

        viewModel.addBluescope(this, blueData)

        blueRecyclerView.adapter =
            bluescopeAdapter(
                blueData,
                this
            )
        blueRecyclerView.layoutManager = GridLayoutManager(this, 3)

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
