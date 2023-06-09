package com.example.infopendakian.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.infopendakian.fragment.FragmentPeralatan
import com.example.infopendakian.fragment.FragmentTips



class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = FragmentPeralatan()
            1 -> fragment = FragmentTips()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        var title = ""
        when (position) {
            0 -> title = "Peralatan"
            1 -> title = "Tips"
        }
        return title
    }
}