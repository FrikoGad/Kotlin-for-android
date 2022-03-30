package com.example.lesson5

/*Простой вариант реализации ViewPager2 C TabLayout*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.lesson5.adapter.PagerAdapter
import com.example.lesson5.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initial()
    }

    private fun initial() {
        binding.viewPager.adapter = PagerAdapter(this)
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPager) {
            tab, pos ->
            when(pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_home_work_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.one))
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_cloud_queue_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.two))
                    tab.icon?.alpha = 70
                }
                2 -> {
                    tab.setIcon(R.drawable.ic_baseline_motion_photos_on_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.three))
                    tab.icon?.alpha = 70
                }
            }
        }.attach()
        binding.tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab) {
                tab.icon?.alpha = 250
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                tab.icon?.alpha = 70
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
            }

        })
    }
}