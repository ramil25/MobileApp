package com.education.mobileapp.Quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.education.mobileapp.MainActivity
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    var correct: Int = 0
    var totalQue: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_result)

        // getting score and number of question from constant and quiz activity class
        correct = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        totalQue = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        // displaying score
        pointTV.text = "$correct"
        queNumTV.text = "$totalQue"

        // inserting data of quiz result to database
        var db = SQLiteDBHelper(this)
        db.insertData(pointTV.text.toString().toInt(), queNumTV.text.toString().toInt())
    }
    // Function for going back to home
    fun home(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}