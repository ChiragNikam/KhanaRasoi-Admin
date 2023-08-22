package com.example.khanarasoiadmin.b_Classes

class Class2_DeliveryDetails(_cust_name: String, _payment_status: Boolean, _delivery_status: Boolean) {
    public var cust_name = ""
    public var payment_status = false
    public var delivery_status = false
    init {
        cust_name = _cust_name
        payment_status = _payment_status
        delivery_status = _delivery_status
    }
}