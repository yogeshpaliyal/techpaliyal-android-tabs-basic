package com.techpaliyal.androidtabs.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.techpaliyal.androidtabs.R

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    private val arrTitles: ArrayList<String>  = ArrayList<String>()
    private val arrFragments : ArrayList<Fragment>  = ArrayList<Fragment>()

    fun addFragment(title: String, frag: Fragment){
        arrTitles.add(title)
        arrFragments.add(frag)
    }

    override fun getItem(position: Int): Fragment {
        return arrFragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return arrTitles[position]
    }

    override fun getCount(): Int {
        return arrFragments.size
    }
}