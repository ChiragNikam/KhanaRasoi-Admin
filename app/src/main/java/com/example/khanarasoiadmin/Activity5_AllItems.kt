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
    }
}