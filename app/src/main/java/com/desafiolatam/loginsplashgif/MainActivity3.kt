package com.desafiolatam.loginsplashgif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnActMain3.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            var dato :String = etRescateDeData.text.toString()
            val b : Bundle = Bundle()
            b.putString("dt",dato)
            intent.putExtras(b)
            startActivity(intent)
        }
    }
}