package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        // al darle click al botón entrar, se dirige a Usuario

        val btn: Button = findViewById(R.id.bttn_Pnuevo)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, NuevoProductoActivity:: class.java)
            startActivity(intent)
        }

        // al darle click al botón entrar, se dirige a Usuario

        val btn1: ImageButton = findViewById(R.id.bttn_Parray)
        btn1.setOnClickListener {

            val intent: Intent = Intent(this, ProductoVendedorActivity:: class.java)
            startActivity(intent)
        }
    }
}