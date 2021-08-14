package com.education.mobileapp.Quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.education.mobileapp.MainActivity
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_result)

        // getting score and number of question from constant and quiz activity class
        val correct = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQue = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        // displaying score
        scoreTV.text = "$correct / $totalQue"
    }
    // Function for going back to home
    fun home(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}