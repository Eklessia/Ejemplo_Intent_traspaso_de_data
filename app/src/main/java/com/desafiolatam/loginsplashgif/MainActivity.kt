package com.desafiolatam.loginsplashgif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.view.WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(2000)
        Toast.makeText(applicationContext, "ManoNegra Object Access Interface ", Toast.LENGTH_LONG)
            .show()
        setTheme(R.style.AppTheme)

        setContentView(R.layout.activity_main)


      etTextViewMain.text = acessoSharedPref!!.getString("Nombre de Usuario", "")

        btnActMain.setOnClickListener {
            val intento1a2 = Intent(this, MainActivity2::class.java)
            startActivity(intento1a2)
            Toast.makeText(this, "Asi guardamos en Shared ", Toast.LENGTH_SHORT).show()
        }
    }


}
