package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BebidasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)

        val btn: ImageButton = findViewById(R.id.bttn_Barray)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, ProductoClienteActivity:: class.java)
            startActivity(intent)
        }
    }
}