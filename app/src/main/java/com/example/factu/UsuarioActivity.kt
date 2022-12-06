package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        // al darle click al botón entrar, se dirige a Usuario

        val btn: Button = findViewById(R.id.bttn_Ueditar)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, UsuarioEditarActivity:: class.java)
            startActivity(intent)
        }

        // al darle click al botón entrar, se dirige a Usuario

        val btn1: Button = findViewById(R.id.bttn_Uproductos)
        btn1.setOnClickListener {

            val intent: Intent = Intent(this, ProductosActivity:: class.java)
            startActivity(intent)
        }

        // al darle click al botón entrar, se dirige a Usuario

        val btn2: Button = findViewById(R.id.bttn_Unuevo)
        btn2.setOnClickListener {

            val intent: Intent = Intent(this, NuevoProductoActivity:: class.java)
            startActivity(intent)
        }
    }
}