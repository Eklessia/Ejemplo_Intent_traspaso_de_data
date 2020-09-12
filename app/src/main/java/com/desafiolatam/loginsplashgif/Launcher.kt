package com.desafiolatam.loginsplashgif

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

var acessoSharedPref : SharedPreferences? = null

class Launcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_launcher)

        acessoSharedPref = getSharedPreferences("datos", Context.MODE_PRIVATE)


        Handler().postDelayed({

            if(acessoSharedPref!!.getString("nNombre de Usuario", null) == null){
                startActivity(Intent(this, LoginActivity::class.java))
            }else {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }, 3000)
    }
}


/**
Animalciones            Toast.makeText(this, "quiero eliminar este ", Toast.LENGTH_SHORT).show()
Animation animacion1 = Animation . Utils . loadAnimation (this, R.anim.desplazamiento_arriba)
Animation animacion2 = Animation . Utils . loadAnimation (this, R.anim.desplazamiento_abajo)

TextView hardroid = findViewById (R.id.tvHardroid)
TextView manonegra = findViewById (R.id.tvManonegra)
ImageView moai = findViewById (R.id.ivMoai)

tvHardroid.setAnimation.animacion2
tvManonegra.setAnimation.animacion2
ivMoai.setAnimation.animacion1

 Handler().postDelayed({
 if(acessoSharedPref!!.getString("nomeUsuario", null) == null){
                startActivity(Intent(this, Cadastro::class.java))
           }else {
               startActivity(Intent(this, MainActivity::class.java))
           }
        }, 3000)
    }
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
startActivity(intento1a2)**/

