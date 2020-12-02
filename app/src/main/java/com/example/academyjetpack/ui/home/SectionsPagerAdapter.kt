package com.example.academyjetpack.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.academyjetpack.R
import com.example.academyjetpack.ui.academy.AcademyFragment
import com.example.academyjetpack.ui.bookmark.BookmarkFragment

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> AcademyFragment()
            1 -> BookmarkFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(TAB_TITLES[position])

    override fun getCount(): Int = 2

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.home, R.string.bookmark)
    }
}