package com.example.khanarasoiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.example.khanarasoiadmin.databinding.Activity4AddItemBinding

class Activity4_AddItem : AppCompatActivity() {

    private val binding: Activity4AddItemBinding by lazy {
        Activity4AddItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // setting toolbar
        val toolbar = binding.toolbarAddNenu;
        setSupportActionBar(toolbar);
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true);
            supportActionBar?.setHomeAsUpIndicator(R.drawable.back_button_icon);  // back button on toolbar
        }

        val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){uri->
            if(uri != null){
                binding.imgViewItemImage.setImageURI(uri)
            }
        }
        binding.cardViewItemImage.setOnClickListener{
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }

        binding.txtViewItemImage.setOnClickListener{
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }
    }
}