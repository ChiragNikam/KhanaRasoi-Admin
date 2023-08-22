package com.example.khanarasoiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.khanarasoiadmin.a_Adapters.Adapter2_DeliveryDetails
import com.example.khanarasoiadmin.b_Classes.Class2_DeliveryDetails
import com.example.khanarasoiadmin.databinding.Activity6DeliveryDetailsBinding

class Activity6_DeliveryDetails : AppCompatActivity() {

    private val binding: Activity6DeliveryDetailsBinding by lazy {
        Activity6DeliveryDetailsBinding.inflate(layoutInflater)
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

        val detail1 = Class2_DeliveryDetails("Ramu", true, true)
        val detail2 = Class2_DeliveryDetails("Shamu", false, true)
        val detail3 = Class2_DeliveryDetails("Mamu", false, false)
        val detail4 = Class2_DeliveryDetails("Ramu", true, false)

        var deliveryDetails = arrayListOf<Class2_DeliveryDetails>()
        deliveryDetails.add(detail1)
        deliveryDetails.add(detail2)
        deliveryDetails.add(detail3)
        deliveryDetails.add(detail4)
        val adapter = Adapter2_DeliveryDetails(deliveryDetails)
        binding.recyclerViewDeliveryDetails.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewDeliveryDetails.adapter = adapter
    }
}