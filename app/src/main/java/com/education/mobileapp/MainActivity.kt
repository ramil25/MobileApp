package com.education.mobileapp
//all importss
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.title="Pangunahing Pamimilian"
        setContentView(R.layout.activity_main)
    }
    private val context : Context = this
    fun openLayunin(view: View) {
        val i = Intent(context,Layunin::class.java);
        startActivity(i);
    }

    fun isara(view: View) {
        finish()
        System.exit(0)
    }
}