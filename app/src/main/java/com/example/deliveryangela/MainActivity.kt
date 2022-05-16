package com.example.deliveryangela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.deliveryangela.databinding.ActivityMainBinding
import com.example.deliveryangela.interface_user.Principal

class MainActivity : AppCompatActivity() {
    private lateinit var views: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListener()
    }

    private fun initializacionListener() {
        views.button.setOnClickListener {
            val userText = views.editTextUserName2.text.toString()
            val passwordText = views.editTextTextPassword2.text.toString()

            userText?.let {
                passwordText?.let { itp->

                     if (it.equals("angela") && itp.equals("123")) {
                    goToPrincipal(userText)
                    }
                }
            }
        }

    }

    private fun goToPrincipal(userText: String) {
        var intent:Intent = Intent(this, Principal::class.java)
        intent.putExtra("name_user",userText)
        startActivity(intent)
    }}