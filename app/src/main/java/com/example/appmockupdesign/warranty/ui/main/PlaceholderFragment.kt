package com.example.appmockupdesign.warranty.ui.main

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.appmockupdesign.R
import com.example.appmockupdesign.warranty.WarrantyShow
import kotlinx.android.synthetic.main.fragment_warranty.*

class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_warranty, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var viewModel = ViewModelProviders.of(this).get(PageViewModel::class.java)

        button3.setOnClickListener(){
            val mAlertDialog = AlertDialog.Builder(context)
            mAlertDialog.setMessage(R.string.warrantyPopup) //set alertdialog message
            mAlertDialog.setPositiveButton("Yes") { dialog, id ->
                startActivity(Intent(context,WarrantyShow::class.java))
                // Toast.makeText(context, "Yes", Toast.LENGTH_SHORT).show()
            }
            mAlertDialog.setNegativeButton("No") { dialog, id ->
                //perform som tasks here
                //Toast.makeText(context, "No", Toast.LENGTH_SHORT).show()
            }
            mAlertDialog.show()
        }
    }

    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}