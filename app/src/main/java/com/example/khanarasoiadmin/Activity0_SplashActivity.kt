package com.example.khanarasoiadmin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

@SuppressLint("CustomSplashScreen")
class Activity0_SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity0_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity1_Login::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}