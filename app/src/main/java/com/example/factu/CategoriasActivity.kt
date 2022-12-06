package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CategoriasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)

        // al darle click al botón entrar, se dirige a Usuario

        val btn: Button = findViewById(R.id.bttn_Ccomidas)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, ComidasActivity:: class.java)
            startActivity(intent)
        }

        val btn1: Button = findViewById(R.id.bttn_Cdulce)
        btn1.setOnClickListener {

            val intent: Intent = Intent(this, DulceActivity:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.bttn_Csalado)
        btn2.setOnClickListener {

            val intent: Intent = Intent(this, SaladoActivity:: class.java)
            startActivity(intent)
        }

        val btn3: Button = findViewById(R.id.bttn_Cbebidas)
        btn3.setOnClickListener {

            val intent: Intent = Intent(this, BebidasActivity:: class.java)
            startActivity(intent)
        }

        val btn4: Button = findViewById(R.id.bttn_Cotros)
        btn3.setOnClickListener {

            val intent: Intent = Intent(this, OtrosActivity:: class.java)
            startActivity(intent)
        }
    }
}