package com.example.khanarasoiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.khanarasoiadmin.a_Adapters.Adapter3_PendingOrders
import com.example.khanarasoiadmin.b_Classes.Class3_PendingOrders
import com.example.khanarasoiadmin.databinding.Activity8PendingOrdersBinding

class Activity8_PendingOrders : AppCompatActivity() {
    val binding: Activity8PendingOrdersBinding by lazy {
        Activity8PendingOrdersBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val order1 = Class3_PendingOrders("Shamu", 2, "Dispatch")
        val order2 = Class3_PendingOrders("Mamu", 1, "Accept")
        val order3 = Class3_PendingOrders("Ramu", 3, "Dispatch")
        val order4 = Class3_PendingOrders("Shamu", 2, "Dispatch")
        val order5 = Class3_PendingOrders("Shamu", 2, "Dispatch")
        val order6 = Class3_PendingOrders("Shamu", 2, "Dispatch")

        val adapter = Adapter3_PendingOrders(mutableListOf(order1, order2, order3, order4, order5, order6))
        binding.recyclerViewPendingOrders.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewPendingOrders.adapter = adapter
    }
}