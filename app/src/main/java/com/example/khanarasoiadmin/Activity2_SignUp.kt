package com.example.khanarasoiadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.khanarasoiadmin.b_Classes.Class4_DataModel_for_Admin_Signup
import com.example.khanarasoiadmin.databinding.Activity2SignUpBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Activity2_SignUp : AppCompatActivity() {

    // Variables for firebase authentication and operations to database
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference

    // Input Fields for database
    private lateinit var admin_name: String
    private lateinit var restro_name: String
    private lateinit var email: String
    private lateinit var password: String

    private val binding: Activity2SignUpBinding by lazy {
        Activity2SignUpBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // initialize late init
        auth = Firebase.auth
        database = Firebase.database.reference

        binding.txtViewHaveAccount.setOnClickListener {
            val intent = Intent(this, Activity1_Login::class.java)
            startActivity(intent)
        }

        // create account on clicking "CREATE ACCOUNT" button
        binding.btnCreateAccount.setOnClickListener {

            admin_name = binding.editTextUserName.text.toString().trim()
            restro_name = binding.editTextRestoName.text.toString().trim()
            email = binding.editTextEmail.text.toString().trim()
            password = binding.editTextPassword.text.toString().trim()

            // check if user had filled all the fields
            if (admin_name.isNotEmpty() && restro_name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                // create Login Id
                createLoginId(email, password)

                // Insert User to the Database
                insertUser(admin_name, restro_name, email, password)

                Toast.makeText(this, "Account Created Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Activity3_OrderSummery::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Please Enter all Fields", Toast.LENGTH_SHORT).show()
            }

        }
    }

    // set user data to the database
    private fun insertUser(
        _admin_name: String,
        _restro_name: String,
        _email: String,
        _password: String
    ) {
        // Set Data Model Class
        val adminSignup =
            Class4_DataModel_for_Admin_Signup(_admin_name, _restro_name, _email, _password)

        // create a unique user id
        val userId = FirebaseAuth.getInstance().currentUser!!.uid

        // insert data
        database.child("admin").child(userId).setValue(adminSignup)
    }

    private fun createLoginId(_email: String, _password: String) {
        auth.createUserWithEmailAndPassword(_email, _password).addOnCompleteListener { task ->
            if(task.isSuccessful){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}