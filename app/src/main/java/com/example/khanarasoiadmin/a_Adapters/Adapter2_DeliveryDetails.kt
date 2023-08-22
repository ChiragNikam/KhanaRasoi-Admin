package com.example.khanarasoiadmin.a_Adapters

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.khanarasoiadmin.R
import com.example.khanarasoiadmin.b_Classes.Class1_AllItems
import com.example.khanarasoiadmin.b_Classes.Class2_DeliveryDetails
import com.example.khanarasoiadmin.databinding.Layout1AllItemsBinding
import com.example.khanarasoiadmin.databinding.Layout2DeliveryDetailsBinding
import com.squareup.picasso.Picasso

class Adapter2_DeliveryDetails(private val orderDetails: MutableList<Class2_DeliveryDetails>) :
    RecyclerView.Adapter<Adapter2_DeliveryDetails.Adapter_Binding>() {
    // bug here
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Binding {
        return Adapter_Binding(
            Layout2DeliveryDetailsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Adapter_Binding, position: Int) {
        val order_info = orderDetails[position]
        holder.binding.txtViewCustomerName.text = order_info.cust_name
        if (order_info.payment_status) {
            holder.binding.txtViewPaymentStatus.setTextColor(holder.binding.root.context.getColor(R.color.start_color_green))
            holder.binding.txtViewPaymentStatus.text = "Recived"
        } else {
            holder.binding.txtViewPaymentStatus.setTextColor(holder.binding.root.context.getColor(R.color.red))
            holder.binding.txtViewPaymentStatus.text = "Not Recived"
        }

        if (order_info.delivery_status) {
            holder.binding.imgViewDeliveryStatus.setColorFilter(
                holder.binding.root.context.getColor(
                    R.color.start_color_green
                )
            )
            holder.binding.txtViewDeliveryStatus.text = "Delivered"
        } else {
            holder.binding.txtViewDeliveryStatus.text = "Not Delivered"
        }
    }

    override fun getItemCount(): Int {
        return orderDetails.size
    }

    private fun deleteCartItem(position: Int) {
        orderDetails.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, orderDetails.size)
    }

    class Adapter_Binding(val binding: Layout2DeliveryDetailsBinding) :
        RecyclerView.ViewHolder(binding.root)

}