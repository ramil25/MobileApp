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
import kotlinx.android.synthetic.main.activity_quiz_type4.*
import kotlinx.android.synthetic.main.choices_dialog.view.*

class QuizType4 : AppCompatActivity(), View.OnClickListener {

    private var currentPosition: Int = 1
    private var questionList: ArrayList<QuestionModel4>? = null
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
        setContentView(R.layout.activity_quiz_type4)
        supportActionBar!!.hide()

        // alert dialog builder
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Panuto")
        builder.setPositiveButton("Simulan") { dialog, which -> // Do nothing
        }

        val title: String = KwarterListAdapter.topic_name

        when {
            title=="Suplemental 3" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                // retrieving set of question
                questionList = Constants4.getQuestion()
                // getting quiz info and display it
                kwart = 1
                supl = 3
                pagsasanayNum = 1
                quizNumTV4.text = pagsasanayNum.toString()
                // message of dialog
                builder.setMessage("Punan ang angkop na ekspresyon ang bawat pahayag upang mabuo ang Konsepto ng Pananaw sa bawat bilang." +
                        "Piliin ang sagot sa mga pamimilian. \n\n ( Gumamit ng wastong laki at liit ng titik batay sa pangungusap )")
            }
            title=="Suplemental 4" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                // retrieving set of question
                questionList = Constants5.getQuestion()
                // getting quiz info and display it
                kwart = 1
                supl = 4
                pagsasanayNum = 1
                hasNextQuiz = 1
                quizNumTV4.text = pagsasanayNum.toString()
                // message of dialog
                builder.setMessage("Punan ng angkop na pananda ang patlang upang mabuo ang ideya ng pahayag." +
                        "Hanapin ang sagot sa mga pamimilian. \n\n ( Gumamit ng wastong laki at liit ng titik batay sa pangungusap )")
            }
        }
        // showing app dialog
        builder.show()

        setQuestion()

        button9.setOnClickListener(this)
        submitBTN3.setOnClickListener(this)
        resultBTN1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        // sounds maker
        mediaPlayer1 = MediaPlayer.create(this, R.raw.button_click_sound)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.correct_sound)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.wrong_sound)

        mediaPlayer1?.start()

        when (v?.id) {
            R.id.submitBTN3 -> {
                if (currentPosition <= questionList!!.size) {

                    if(submitBTN3.text != "Susunod") {
                        // check if correct answer
                        if(answerET1.text.toString() == correctAnswerTV1.text) {
                            answerET1.clearFocus()
                            answerET1.setBackgroundResource(R.drawable.correct_option_border_bg)
                            answerET1.setTextColor(Color.parseColor("#03A9F4"))
                            correctAnswers++
                            setNextQuestion()
                            correctIMG3.visibility = View.VISIBLE

                            // starting correct sound
                            mediaPlayer2?.start()
                        }
                        // check if is empty
                        else if (answerET1.text.toString() == "") {
                            Toast.makeText(
                                this,
                                "Pakiusap lagyan ng sagot ang sagutan.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            answerET1.clearFocus()
                            answerET1.setBackgroundResource(R.drawable.wrong_option_border_bg)
                            setNextQuestion()

                            // starting wrong sound
                            mediaPlayer3?.start()
                        }
                    }
                    else {
                        answerET1.text.clear()
                        correctAnswerTV1.visibility = View.INVISIBLE
                        answerET1.setBackgroundResource(R.drawable.edit_text_border)
                        answerET1.setTextColor(Color.parseColor("#000000"))
                        setQuestion()
                    }
                }
            }
            R.id.button9 -> {
                val question = questionList!![currentPosition - 1]
                // inflater for dialog layout
                val view = View.inflate(this, R.layout.choices_dialog, null)

                // dialog for choices
                val builder = AlertDialog.Builder(this)
                builder.setView(view)

                val dialog = builder.create()
                dialog.show()
                dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

                view.closeDialBTN.setOnClickListener{ dialog.dismiss() }

                // getting choices and display it
                view.pamTV1.text = question.choice1
                view.pamTV2.text = question.choice2
                view.pamTV3.text = question.choice3
                view.pamTV4.text = question.choice4
                view.pamTV5.text = question.choice5
                view.pamTV6.text = question.choice6
                view.pamTV7.text = question.choice7
                view.pamTV8.text = question.choice8
                view.pamTV9.text = question.choice9
                view.pamTV10.text = question.choice10
            }
            R.id.resultBTN1 -> {
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

    private fun setQuestion() {
        val question = questionList!![currentPosition - 1]

        // enable edit text to be use
        answerET1.isEnabled = true

        if (currentPosition <= questionList!!.size) {
            submitBTN3.text = "Sagutan"
        }

        // progress bar and text view logic
        progressBar3.progress = currentPosition
        progressBar3.max = questionList!!.size.toString().toInt()
        qNum4.text = "$currentPosition" + " / " + questionList!!.size

        // getting question and answer then display it
        questionTV4.text = question!!.question
        correctAnswerTV1.text = question.correctAnswer

        correctIMG3.visibility = View.INVISIBLE
    }

    private fun setNextQuestion() {
        if (currentPosition >= questionList!!.size) {
            submitBTN3.visibility = View.INVISIBLE
            resultBTN1.visibility = View.VISIBLE
        } else {
            submitBTN3.text = "Susunod"
        }
        correctAnswerTV1.visibility = View.VISIBLE
        currentPosition++

        // disable edit text to be use
        answerET1.isEnabled = false

        releaseMP()
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