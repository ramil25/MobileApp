package com.education.mobileapp
//all importss
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.title="Pangunahing Pamimilian"
        setContentView(R.layout.activity_main)
    }
}