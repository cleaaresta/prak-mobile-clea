package com.example.greenlite

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch {
            delay(2000) // simulasi pengambilan data selama 2 detik

            // Mengarahkan ke AuthActivity. 
            // AuthActivity akan mengecek SharedPreferences untuk menentukan apakah lanjut ke MainActivity atau tetap di Login.
            val intent = Intent(this@SplashScreenActivity, BaseActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
