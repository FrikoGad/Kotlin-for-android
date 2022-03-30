package com.example.lesson5.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lesson5.screen.FirstFragment
import com.example.lesson5.screen.SecondFragment
import com.example.lesson5.screen.ThirdFragment

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }


}