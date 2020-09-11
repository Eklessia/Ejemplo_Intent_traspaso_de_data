package com.desafiolatam.loginsplashgif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnActLogin.setOnClickListener {
            val intento2a3 = Intent(this, MainActivity2::class.java)
            startActivity(intento2a3)

        }
    }
}