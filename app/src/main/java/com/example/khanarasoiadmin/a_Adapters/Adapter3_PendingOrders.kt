package com.example.khanarasoiadmin.a_Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.khanarasoiadmin.b_Classes.Class2_DeliveryDetails
import com.example.khanarasoiadmin.b_Classes.Class3_PendingOrders
import com.example.khanarasoiadmin.databinding.Layout3PendingOrdersBinding

class Adapter3_PendingOrders(private val pendingOrders: MutableList<Class3_PendingOrders>) :
    RecyclerView.Adapter<Adapter3_PendingOrders.Adapter_Binding>() {
    class Adapter_Binding(val binding: Layout3PendingOrdersBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Adapter_Binding {
        return Adapter_Binding(
            Layout3PendingOrdersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Adapter_Binding, position: Int) {
        val order_details = pendingOrders[position]
        holder.binding.txtViewFoodName.text = order_details.name
        holder.binding.txtViewQuantity.text = order_details.quantity.toString()
        holder.binding.btnDispatchOrAccept.text = order_details.dispatch_or_accept
    }

    override fun getItemCount(): Int {
        return pendingOrders.size
    }
}