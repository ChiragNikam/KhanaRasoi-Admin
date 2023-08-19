package com.example.khanarasoiadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.khanarasoiadmin.databinding.Activity1LoginBinding

class Activity1_Login : AppCompatActivity() {

    private val binding : Activity1LoginBinding by lazy {
        Activity1LoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtViewDontHaveAccount.setOnClickListener{
            Toast.makeText(this, "Create Account", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Activity2_SignUp::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, Activity3_OrderSummery::class.java)
            startActivity(intent)
        }
    }
}