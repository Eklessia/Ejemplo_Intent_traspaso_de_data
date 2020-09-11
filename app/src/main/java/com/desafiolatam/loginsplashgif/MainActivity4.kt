 package com.desafiolatam.loginsplashgif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

 class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

    var bundle = intent.extras
        tvRescateDeDataLlega.text=bundle?.getString("dt")

    }
}