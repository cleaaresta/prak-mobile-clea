package com.example.greenlite

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.greenlite.databinding.ActivityMainBinding
import com.example.greenlite.pertemuan_4.FourthActivity
import com.example.greenlite.pertemuan_5.FifthActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToFourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("nama", "Politeknik Caltex Riau")
            intent.putExtra("asal", "Rumbai")
            intent.putExtra("umur", 25)
            startActivity(intent)
        }

        // Tambahkan tombol untuk ke Pertemuan 5 jika ada di layout, 
        // atau ganti sementara fungsi tombol yang ada untuk testing.
        binding.root.setOnClickListener {
             val intent = Intent(this, FifthActivity::class.java)
             startActivity(intent)
        }
    }
}