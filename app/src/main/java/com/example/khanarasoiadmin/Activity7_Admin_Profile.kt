package com.example.khanarasoiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khanarasoiadmin.databinding.Activity7AdminProfileBinding

class Activity7_Admin_Profile : AppCompatActivity() {

    val binding: Activity7AdminProfileBinding by lazy {
        Activity7AdminProfileBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // setting toolbar
        val toolbar = binding.toolbarAdminProfile;
        setSupportActionBar(toolbar);
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true);
            supportActionBar?.setHomeAsUpIndicator(R.drawable.back_button_icon);  // back button on toolbar
        }
    }
}