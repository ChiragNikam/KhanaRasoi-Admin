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

        // Add Food Items
        binding.cardViewAddMenu.setOnClickListener{
            val intent = Intent(this, Activity4_AddItem::class.java)
            startActivity(intent)
        }

        // All Items
        binding.cardViewAllItems.setOnClickListener{
            val intent = Intent(this, Activity5_AllItems::class.java)
            startActivity(intent)
        }

        // Order Summery
        binding.cardViewOrderDispatch.setOnClickListener {
            val intent = Intent(this, Activity6_DeliveryDetails::class.java)
            startActivity(intent)
        }

        // Admin Profile
        binding.cardViewProfile.setOnClickListener{
            val intent = Intent(this, Activity7_Admin_Profile::class.java)
            startActivity(intent)
        }

        // Pending Orders
        binding.imgPendingOrders.setOnClickListener {
            val intent = Intent(this, Activity8_PendingOrders::class.java)
            startActivity(intent)
        }
        binding.txtViewPendingOrders.setOnClickListener {
            val intent = Intent(this, Activity8_PendingOrders::class.java)
            startActivity(intent)
        }
        binding.txtViewPendingOrdersCount.setOnClickListener {
            val intent = Intent(this, Activity8_PendingOrders::class.java)
            startActivity(intent)
        }

        // Log Out
        binding.cardViewLogOut.setOnClickListener{
            val intent = Intent(this, Activity1_Login::class.java)
            startActivity(intent)
        }
    }
}