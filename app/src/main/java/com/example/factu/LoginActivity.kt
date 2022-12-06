package com.example.factu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // al darle click al botón entrar, se dirige a Usuario

        val btn: Button = findViewById(R.id.bttn_Lentrar)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, UsuarioActivity:: class.java)
            startActivity(intent)
        }

        // al darle click al botón registrate, se dirige a Register

        val btn1: Button = findViewById(R.id.bttn_Lregistrate)
        btn1.setOnClickListener {

            val intent: Intent = Intent(this, RegisterActivity:: class.java)
            startActivity(intent)
        }

    }
}