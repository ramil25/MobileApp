package com.education.mobileapp
//all importss
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.education.mobileapp.Quiz.QuizzesScores



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.title = "Pangunahing Pamimilian"
        setContentView(R.layout.activity_main)
    }

    private val context: Context = this
    //Layunin Button
    fun openLayunin(view: View) {
        val mp = MediaPlayer.create(context,R.raw.button_click_sound)
        mp.start();
        val i = Intent(context, Layunin::class.java);
        startActivity(i);
    }
    //Quarter List Button
    fun quarterList(view: View) {
        val mp = MediaPlayer.create(context,R.raw.button_click_sound)
        mp.start();
        val i = Intent(context,QuarterList::class.java);
        startActivity(i);
    }
    //Isara Button
    fun isara(view: View) {
        val mp = MediaPlayer.create(context,R.raw.button_click_sound)
        mp.start();
        val exitApp = AlertDialog.Builder(this, R.style.ThemeOverlay_MaterialComponents_Dialog)
        exitApp.setMessage("Sigurado ka ba na gusto mong isara ang Wika'skwela?")
        exitApp.setTitle("Babala")
        exitApp.setPositiveButton("Oo") { dialog, which ->
            finish()
            System.exit(0)
        }
        exitApp.setNegativeButton("Hindi", null)
        exitApp.show()
    }

    fun quizInfoScores(view: View) {
        val mp = MediaPlayer.create(context,R.raw.button_click_sound)
        mp.start();
        val i = Intent(context, com.education.mobileapp.Quiz.QuizzesScores::class.java)
        startActivity(i)
    }
}

