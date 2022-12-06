package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // al darle click al botón crear cuenta, se dirige a Productos

        val btn: Button = findViewById(R.id.bttn_RcrearCuenta)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, ProductosActivity:: class.java)
            startActivity(intent)
        }
    }
}