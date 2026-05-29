package com.example.greenlite.Home.pertemuan_10

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.greenlite.R
import com.example.greenlite.databinding.ActivityTenthBinding
import com.google.android.material.tabs.TabLayoutMediator

class TenthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTenthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTenthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Pertemuan 10"
            setDisplayHomeAsUpEnabled(true)
        }

        // 1. Inisialisasi Adapter
        val tabsAdapter = TenthTabsAdapter(this)

        // 2. Set adapter ke ViewPager2
        binding.viewPager.adapter = tabsAdapter

        // 3. Hubungkan TabLayout & ViewPager2 menggunakan TabLayoutMediator
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            // Atur judul, icon, dan badge untuk setiap tab
            when (position) {
                0 -> {
                    tab.text = "Tab A"
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_home)
                    val badge = tab.getOrCreateBadge()
                    badge.isVisible = true
                }
                1 -> {
                    tab.text = "Tab B"
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_home)
                    val badge = tab.getOrCreateBadge()
                    badge.isVisible = true
                    badge.number = 5
                }
                2 -> {
                    tab.text = "Produk"
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_home)
                }
            }
        }.attach()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
