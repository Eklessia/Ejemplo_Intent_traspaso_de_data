package com.desafiolatam.loginsplashgif

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var editorSharedPref : SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


       editorSharedPref = acessoSharedPref!!.edit()

        btnActLogin.setOnClickListener {
            if (etDatosLogin.text.isEmpty()){
                Toast.makeText(this, "Completa los datos Correctamente", Toast.LENGTH_LONG).show()
            }else{
                editorSharedPref!!.putString("Nombre de Usuario", etDatosLogin.text.toString())
                editorSharedPref!!.apply()

                startActivity(Intent(this, MainActivity::class.java))
            }
        }

        /*btnActLogin.setOnClickListener {
            val intento2a3 = Intent(this, MainActivity2::class.java)
            startActivity(intento2a3)
        }*/
        }
}