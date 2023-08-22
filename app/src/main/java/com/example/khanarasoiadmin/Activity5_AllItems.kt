package com.example.khanarasoiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.khanarasoiadmin.a_Adapters.Adapter1_AllItems
import com.example.khanarasoiadmin.b_Classes.Class1_AllItems
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

        // Add image to Array List (of type SlideModel) by image links
        val cart_item1 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item2 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item3 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item4 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item5 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item6 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item7 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item8 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_item9 = Class1_AllItems(
            "Pav Bhaji",
            20,
            "https://images.lifestyleasia.com/wp-content/uploads/sites/7/2022/02/01171421/YFL-Pav-Bhaji-2.jpg?tr=w-1600",
            1
        )
        val cart_items: MutableList<Class1_AllItems> = mutableListOf(
            cart_item1,
            cart_item2,
            cart_item3,
            cart_item4,
            cart_item5,
            cart_item6,
            cart_item7,
            cart_item8,
            cart_item9
        )
        val adapter = Adapter1_AllItems(cart_items)
        binding.recyclerViewAllItems.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewAllItems.adapter = adapter
    }
}