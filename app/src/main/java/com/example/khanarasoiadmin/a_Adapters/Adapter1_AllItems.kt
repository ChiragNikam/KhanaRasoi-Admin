package com.example.khanarasoiadmin.a_Adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.khanarasoiadmin.b_Classes.Class1_AllItems
import com.example.khanarasoiadmin.databinding.Layout1AllItemsBinding
import com.squareup.picasso.Picasso

class Adapter1_AllItems(private val cartItems: MutableList<Class1_AllItems>) :
    RecyclerView.Adapter<Adapter1_AllItems.Adapter_Binding>() {
    // bug here
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Binding {
        return Adapter_Binding(
            Layout1AllItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: Adapter_Binding, position: Int) {
        val cart_item = cartItems[position]
        holder.binding.txtViewFoodName.text = cart_item.food_name
        holder.binding.txtViewFoodPrice.text = buildString {
            append("\u20B9")
            append(cart_item.food_price.toString())
        }
        holder.binding.txtViewItemCount.text = cart_item.item_count.toString()
        Picasso.get().load(cart_item.food_logo).into(holder.binding.imgCartFoodItem)

        holder.binding.btnPlus.setOnClickListener {
            var item_count: Int = holder.binding.txtViewItemCount.text.toString().toInt()
            if (item_count < 10) {
                item_count++
                holder.binding.txtViewItemCount.text = item_count.toString()
            }
        }

        holder.binding.btnMunus.setOnClickListener {
            var item_count: Int = holder.binding.txtViewItemCount.text.toString().toInt()
            if (item_count > 1) {
                item_count--
                holder.binding.txtViewItemCount.text = item_count.toString()
            } else {
                deleteCartItem(position)
            }
        }

        holder.binding.btnDelete.setOnClickListener {
            deleteCartItem(position)
        }
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    private fun deleteCartItem(position: Int) {
        cartItems.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, cartItems.size)
    }

    class Adapter_Binding(val binding: Layout1AllItemsBinding) :
        RecyclerView.ViewHolder(binding.root)

}