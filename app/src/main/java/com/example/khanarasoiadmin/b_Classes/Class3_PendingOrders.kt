package com.example.khanarasoiadmin.b_Classes

class Class3_PendingOrders (_name: String, _quantity: Int, _dispatch_or_accept: String){
    val name: String
    val quantity: Int
    val dispatch_or_accept: String

    init {
        this.name = _name
        this.quantity = _quantity
        this.dispatch_or_accept = _dispatch_or_accept
    }
}