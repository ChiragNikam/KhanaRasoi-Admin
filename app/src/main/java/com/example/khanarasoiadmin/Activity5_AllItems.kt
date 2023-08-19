package com.example.khanarasoiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khanarasoiadmin.databinding.Activity5AllItemsBinding

class Activity5_AllItems : AppCompatActivity() {

    private val binding: Activity5AllItemsBinding by lazy {
        Activity5AllItemsBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // setting toolbar
        val toolbar = binding.toolbarAllItems;
        setSupportActionBar(toolbar);
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true);
            supportActionBar?.setHomeAsUpIndicator(R.drawable.back_button_icon);  // back button on toolbar
        }
    }
}