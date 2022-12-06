package com.example.factu

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SaladoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salado)

        // al darle click al botón entrar, se dirige a Usuario

        val btn: ImageButton = findViewById(R.id.bttn_Sarray)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, ProductoClienteActivity:: class.java)
            startActivity(intent)
        }
    }
}