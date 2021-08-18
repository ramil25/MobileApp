package com.education.mobileapp
//all importss
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.education.mobileapp.Quiz.QuizType1


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
        val i = Intent(context, Layunin::class.java);
        startActivity(i);
    }
    //Quarter List Button
    fun quarterList(view: View) {
        val i = Intent(context,QuarterList::class.java);
        startActivity(i);
    }
    //Isara Button
    fun isara(view: View) {
        val exitApp = AlertDialog.Builder(this, R.style.ThemeOverlay_MaterialComponents_Dialog)
        exitApp.setMessage("Sigurado ka ka ba na gusto mong isara ang Wika'skwela?")
        exitApp.setTitle("Babala")
        exitApp.setPositiveButton("Oo") { dialog, which ->
            finish()
            System.exit(0)
        }
        exitApp.setNegativeButton("Hindi", null)
        exitApp.show()
    }

    fun pagsusulit(view: View) {
        val i = Intent(context, QuizType1::class.java)
        startActivity(i)
    }
}

