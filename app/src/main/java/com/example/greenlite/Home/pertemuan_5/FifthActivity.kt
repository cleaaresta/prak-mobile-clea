package com.example.greenlite.Home.pertemuan_5

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.greenlite.R
import com.example.greenlite.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        }

        // Improvisasi Toolbar: Mengatur title pada CollapsingToolbarLayout
        binding.collapsingToolbar.title = "Activity Fifth"

        binding.btnWebView.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }

        // Improvisasi Scrollable Content: Handling FAB
        binding.fab.setOnClickListener {
            Toast.makeText(this, "Floating Action Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            // Improvisasi Option Menu: Handling Sub-menu items
            R.id.sub_menu_about -> {
                Toast.makeText(this, "Tentang Aplikasi: Versi 1.0", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.sub_menu_help -> {
                Toast.makeText(this, "Bantuan: Hubungi admin@example.com", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
