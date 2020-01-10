package com.example.appmockupdesign.transport.ui.main

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProviders
import com.example.appmockupdesign.R
import com.example.appmockupdesign.service.serviewViewModel

private val TAB_TITLES = arrayOf(
    R.string.carType1,
    R.string.carType2,
    R.string.carType3
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :

    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return PlaceholderFragment()
            1 -> return PlaceholderFragment2()
            else -> return PlaceholderFragment3()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 3
    }
}