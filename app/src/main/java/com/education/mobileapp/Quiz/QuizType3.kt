package com.education.mobileapp.Quiz

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.education.mobileapp.KwarterListAdapter
import com.education.mobileapp.QuarterList
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_quiz_type3.*

class QuizType3 : AppCompatActivity(), View.OnClickListener {

    private var currentPosition: Int = 1
    private var questionList: ArrayList<QuestionModel3>? = null
    private var correctAnswers: Int = 0
    private var pagsasanayNum: Int = 0
    private var kwart: Int = 0
    private var supl: Int = 0
    private var hasNextQuiz: Int = 0

    // variable for media player sounds
    private var mediaPlayer1: MediaPlayer? = null
    private var mediaPlayer2: MediaPlayer? = null
    private var mediaPlayer3: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_quiz_type3)

        // alert dialog builder
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Panuto")
        builder.setPositiveButton("Simulan") { dialog, which -> // Do nothing
        }

        val title: String = KwarterListAdapter.topic_name

        when {
            title=="Suplemental 2" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                // retrieving set of question
                questionList = Constants3.getQuestion()
                // getting quiz info and display it
                kwart = 1
                supl = 2
                pagsasanayNum = 2
                quizNumTV2.text = pagsasanayNum.toString()
                hasNextQuiz = 0
                // message of dialog
                builder.setMessage("Punan ang mga linya nang angkop na pang – ugnay upang mabuo ang diwa ng talata." +
                        "\n\n( Gumamit ng wastong laki at liit ng titik batay sa pangungusap )")
            }
        }
        // showing app dialog
        builder.show()

        setQuestion()

        submitBTN2.setOnClickListener(this)
        resultBTN.setOnClickListener(this)
    }

    private fun setQuestion() {
        val question = questionList!![currentPosition - 1]

        // enable edit text to be use
        answerET.isEnabled = true

        // checking if no more question then changing button text
        if (currentPosition <= questionList!!.size) {
            submitBTN2.text = "Sagutan"
        }

        // progress bar and text view logic
        progressBar2.progress = currentPosition
        progressBar2.max = questionList!!.size.toString().toInt()
        qNum2.text = "$currentPosition" + " / " + questionList!!.size

        // getting question and answer then display it
        questionTV3.text = question!!.queston
        correctAnswerTV.text = question.correctAnswer

        correctIMG2.visibility = View.INVISIBLE

        releaseMP()
    }

    override fun onClick(v: View?) {
        // sounds maker
        mediaPlayer1 = MediaPlayer.create(this, R.raw.button_click_sound)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.correct_sound)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.wrong_sound)

        mediaPlayer1?.start()

        when (v?.id) {
            R.id.submitBTN2 -> {

                if (currentPosition <= questionList!!.size) {

                        if (submitBTN2.text != "Susunod") {
                            //check if correct answer
                            if (answerET.text.toString() == correctAnswerTV.text) {
                                answerET.clearFocus()
                                answerET.setBackgroundResource(R.drawable.correct_option_border_bg)
                                answerET.setTextColor(Color.parseColor("#03A9F4"))
                                correctAnswers++
                                setNextQuestion()
                                correctIMG2.visibility = View.VISIBLE

                                // starting correct sound
                                mediaPlayer2?.start()
                            }
                            // check if is empty
                            else if (answerET.text.toString() == "") {
                                Toast.makeText(
                                    this,
                                    "Pakiusap lagyan ng sagot ang sagutan.",
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else {
                                answerET.clearFocus()
                                answerET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                                setNextQuestion()

                                // starting wrong sound
                                mediaPlayer3?.start()
                            }
                        }
                        else {
                            answerET.text.clear()
                            correctAnswerTV.visibility = View.INVISIBLE
                            answerET.setBackgroundResource(R.drawable.edit_text_border)
                            answerET.setTextColor(Color.parseColor("#000000"))
                            setQuestion()
                        }
                        }
            }
            R.id.resultBTN -> {
                releaseMP()

                val i = Intent(this, ResultActivity::class.java)
                i.putExtra(KWARTER, kwart)
                i.putExtra(SUPLEMENTAL, supl)
                i.putExtra(PAGSASANAY, pagsasanayNum)
                i.putExtra(CORRECT_ANSWERS, correctAnswers)
                i.putExtra(TOTAL_QUESTIONS, questionList!!.size)
                i.putExtra(HAS_NEXT_QUIZ, hasNextQuiz)

                startActivity(i)
            }
            }
    }

    // Function for setting next question
    fun setNextQuestion() {

        if (currentPosition >= questionList!!.size) {
            submitBTN2.visibility = View.INVISIBLE
            resultBTN.visibility = View.VISIBLE
        } else {
            submitBTN2.text = "Susunod"
        }
        correctAnswerTV.visibility = View.VISIBLE
        currentPosition++

        // disable edit text to be use
        answerET.isEnabled = false
    }

    // Function for not going back to previous activity
    override fun onBackPressed() {
        //super.onBackPressed()
        Toast.makeText(this, "Pakiusap tapusin muna ang pagsasanay na ito", Toast.LENGTH_SHORT).show()
    }

    // Function for releasing sounds (Media Player)
    private fun releaseMP() {
        mediaPlayer1?.release()
        mediaPlayer2?.release()
        mediaPlayer3?.release()
    }
}