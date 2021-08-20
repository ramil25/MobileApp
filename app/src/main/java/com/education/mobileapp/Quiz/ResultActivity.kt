package com.education.mobileapp.Quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.education.mobileapp.KwarterListAdapter
import com.education.mobileapp.MainActivity
import com.education.mobileapp.QuarterList
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    var correct: Int = 0
    var totalQue: Int = 0
    var kwarter: Int = 0
    var supl: Int = 0
    var quizNum: Int = 0
    var hide: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_result)

        // getting kwarter and suplemental
        kwarter = intent.getIntExtra(KWARTER, 0)
        quizNum = intent.getIntExtra(PAGSASANAY, 0)
        supl = intent.getIntExtra(SUPLEMENTAL, 0)

        // getting score and number of question from constant and quiz activity class
        correct = intent.getIntExtra(CORRECT_ANSWERS, 0)
        totalQue = intent.getIntExtra(TOTAL_QUESTIONS, 0)

        // displaying score
        pointTV.text = "$correct"
        queNumTV.text = "$totalQue"

        // inserting data of quiz result to database
        var db = SQLiteDBHelper(this)
        db.insertData( kwarter.toString().toInt(),
            supl.toString().toInt(),
            quizNum.toString().toInt(),
            pointTV.text.toString().toInt(),
            queNumTV.text.toString().toInt()
        )

        // setting if next quiz is need to hide
        hide = intent.getIntExtra(IS_HIDE, 0)
        isHideTV.text = "$hide"

        // checking if there are more pag sasanay
        val title: String = KwarterListAdapter.topic_name

                if (title == "Suplemental 2" && QuarterList.kwarter_label == "Ika-unang Kwarter") {
                    imageButton.visibility = View.INVISIBLE
                    button8.visibility = View.VISIBLE
                }

                // hiding button
                if (isHideTV.text == "1")  {
                    imageButton.visibility = View.VISIBLE
                    button8.visibility = View.INVISIBLE
                }
    }
    // Function for going back to home
    fun home(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    fun anotherQuiz(view: View) {
        val i = Intent(this, QuizType3::class.java)
        startActivity(i)
    }

}