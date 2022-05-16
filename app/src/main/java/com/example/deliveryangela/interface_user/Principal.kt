package com.example.deliveryangela.interface_user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deliveryangela.R
import com.example.deliveryangela.databinding.ActivityPrincipalBinding

class Principal : AppCompatActivity() {
    private lateinit var views: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(views.root)
        showName(intent)

    }

    private fun showName(intent: Intent){
        var userName =intent.getStringExtra( "name_user")
        views.name1.setText(userName)
    }
}
