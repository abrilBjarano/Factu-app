package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DulceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dulce)

        val btn: ImageButton = findViewById(R.id.bttn_Coarray)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, ProductoClienteActivity:: class.java)
            startActivity(intent)
        }
    }
}