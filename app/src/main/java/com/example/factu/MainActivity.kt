package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // al darle click al botón comprador, se dirige a Categorías

        val btn: Button = findViewById(R.id.bttn_Mcomprador)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, CategoriasActivity:: class.java)
            startActivity(intent)
        }

        // al darle click al botón vendedor, se dirige a Login

        val btn1: Button = findViewById(R.id.bttn_Mvendedor)
        btn1.setOnClickListener {

            val intent: Intent = Intent(this, LoginActivity:: class.java)
            startActivity(intent)
        }



    }
}