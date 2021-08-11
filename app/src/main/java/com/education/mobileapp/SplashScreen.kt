package com.education.mobileapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val mainContent = Intent(applicationContext, MainActivity::class.java)
            startActivity(mainContent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }
    companion object {
        private const val SPLASH_TIME_OUT = 5000
    }
}