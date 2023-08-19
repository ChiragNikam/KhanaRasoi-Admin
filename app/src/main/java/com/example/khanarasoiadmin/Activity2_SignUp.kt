package com.example.khanarasoiadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.khanarasoiadmin.databinding.Activity2SignUpBinding

class Activity2_SignUp : AppCompatActivity() {

    private val binding: Activity2SignUpBinding by lazy {
        Activity2SignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtViewHaveAccount.setOnClickListener{
            val intent = Intent(this, Activity1_Login::class.java)
            startActivity(intent)
        }

        binding.btnCreateAccount.setOnClickListener {
            Toast.makeText(this, "Account Created Successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Activity3_OrderSummery::class.java)
            startActivity(intent)
        }
    }
}