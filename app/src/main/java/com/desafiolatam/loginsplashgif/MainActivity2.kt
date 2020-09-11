package com.desafiolatam.loginsplashgif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnActMain2.setOnClickListener{

               if (etclave.text.toString() == "abc123") {
                val intento1 = Intent(this, MainActivity3::class.java)
                startActivity(intento1)
            } else {
                   Toast.makeText(this, "contraseña falsa", Toast.LENGTH_SHORT).show()
               }
        }



    }
}

/*
 boton1.setOnClickListener{
            finish()
        }
 */