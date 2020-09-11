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
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(2000)
        Toast.makeText(applicationContext, "ManoNegra Object Access Interface ", Toast.LENGTH_LONG)
            .show()
        setTheme(R.style.AppTheme)

        //  getWindow().setFlags(FLAG_LAYOUT_IN_SCREEN, FLAG_LAYOUT_IN_SCREEN)

        setContentView(R.layout.activity_main)

        btnEntrada.setOnClickListener {
            val intento1a2 = Intent(this, LoginActivity::class.java)
            startActivity(intento1a2)
            Toast.makeText(this, "quiero eliminar este ", Toast.LENGTH_SHORT).show()
        }
        }


            /**

        //Animalciones            Toast.makeText(this, "quiero eliminar este ", Toast.LENGTH_SHORT).show()
        Animation animacion1 = Animation . Utils . loadAnimation (this, R.anim.desplazamiento_arriba)
        Animation animacion2 = Animation . Utils . loadAnimation (this, R.anim.desplazamiento_abajo)

        TextView hardroid = findViewById (R.id.tvHardroid)
        TextView manonegra = findViewById (R.id.tvManonegra)
        ImageView moai = findViewById (R.id.ivMoai)

        tvHardroid.setAnimation.animacion2
        tvManonegra.setAnimation.animacion2
        ivMoai.setAnimation.animacion1

        handler ().postDelayes(new Runnable) {

        @override
        Thread.sleep(2000)
        Toast.makeText(
        applicationContext,
        "ManoNegra Object Access Interface ",
        Toast.LENGTH_LONG
        ).show()
        setTheme(R.style.AppTheme)


        val intento1a2 = Intent(this, LoginActivity::class.java)
        startActivity(intento1a2)

        }


        }
         */

    }
