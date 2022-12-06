package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProductoVendedorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto_vendedor)

        // al darle click al botón entrar, se dirige a Usuario

        val btn: Button = findViewById(R.id.bttn_Peditar)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, EditarProductoActivity:: class.java)
            startActivity(intent)
        }
    }
}