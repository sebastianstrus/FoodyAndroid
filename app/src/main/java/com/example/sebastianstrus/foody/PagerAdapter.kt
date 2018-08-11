package com.example.sebastianstrus.foody

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.sebastianstrus.foody.TabFragments.ListFragment
import com.example.sebastianstrus.foody.TabFragments.AddFragment
import com.example.sebastianstrus.foody.TabFragments.MapFragment
import com.example.sebastianstrus.foody.TabFragments.FavoritesFragment
import com.example.sebastianstrus.foody.TabFragments.AccountFragment

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm)  {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ListFragment()
            }
            1 -> AddFragment()
            2 -> MapFragment()
            3 -> FavoritesFragment()
            else -> {
                return AccountFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "List"
            1 -> "Add"
            2 -> "Map"
            3 -> "Favorites"
            else -> {
                return "Account"
            }
        }
    }


}