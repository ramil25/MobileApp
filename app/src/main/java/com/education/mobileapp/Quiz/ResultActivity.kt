package com.education.mobileapp.Quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.education.mobileapp.KwarterListAdapter
import com.education.mobileapp.MainActivity
import com.education.mobileapp.QuarterList
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.perfect_score_dialog.view.*

class ResultActivity : AppCompatActivity() {

    var correct: Int = 0
    var totalQue: Int = 0
    var kwarter: Int = 0
    var supl: Int = 0
    var quizNum: Int = 0
    var hasNext: Int = 0

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
        hasNext = intent.getIntExtra(HAS_NEXT_QUIZ, 0)
        hasNextTV.text = "$hasNext"


        // hiding button
        if (hasNextTV.text == "1")  {
            homeBTN.visibility = View.INVISIBLE
            button8.visibility = View.VISIBLE
        } else {
            homeBTN.visibility = View.VISIBLE
            button8.visibility = View.INVISIBLE
        }

        // showing different dialog depends on score
        var resultSound: MediaPlayer? = null
        if (correct == 10) {
            resultSound = MediaPlayer.create(this, R.raw.yehey_sound)
            perfectView()
            resultSound!!.start()
        }
        else if (correct > 3 && correct < 10) {
            // variables for making sounds
            resultSound = MediaPlayer.create(this, R.raw.clap_sound)
            averageView()
            resultSound!!.start()
        }
        else {
            Toast.makeText(this, "Pagbutihan pa ang pag aaral.", Toast.LENGTH_SHORT).show()
        }
    }
    // Function for going back to home
    fun home(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    fun anotherQuiz(view: View) {

        // checking if there are more pag sasanay
        val title: String = KwarterListAdapter.topic_name

        when  {
            title=="Suplemental 2" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                val i = Intent(this, QuizType3::class.java)
                startActivity(i)
            }
            title=="Suplemental 4" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                val i = Intent(this, QuizType5::class.java)
                startActivity(i)
            }
        }
    }

    // Function for not going back to previous activity
    override fun onBackPressed() {
        //super.onBackPressed()
    }

    // Function for showing images of results
    private fun perfectView() {
        val view = View.inflate(this, R.layout.perfect_score_dialog, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        view.button10.setOnClickListener { dialog.dismiss() }
    }

    private fun averageView() {
        val view = View.inflate(this, R.layout.average_score_dialog, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        view.button10.setOnClickListener { dialog.dismiss() }
    }
}