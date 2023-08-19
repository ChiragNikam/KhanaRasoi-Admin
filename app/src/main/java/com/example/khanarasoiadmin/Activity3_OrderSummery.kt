package com.example.khanarasoiadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khanarasoiadmin.databinding.Activity3OrderSummeryBinding

class Activity3_OrderSummery : AppCompatActivity() {

    private val binding: Activity3OrderSummeryBinding by lazy {
        Activity3OrderSummeryBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cardViewAddMenu.setOnClickListener{
            val intent = Intent(this, Activity4_AddItem::class.java)
            startActivity(intent)
        }

        binding.cardViewAllItems.setOnClickListener{
            val intent = Intent(this, Activity5_AllItems::class.java)
            startActivity(intent)
        }
    }
}