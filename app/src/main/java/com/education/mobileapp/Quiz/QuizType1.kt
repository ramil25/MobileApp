package com.education.mobileapp.Quiz

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.education.mobileapp.KwarterListAdapter
import com.education.mobileapp.QuarterList
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_quiz.*
import kotlinx.android.synthetic.main.activity_quiz.ch1
import kotlinx.android.synthetic.main.activity_quiz.ch2
import kotlinx.android.synthetic.main.activity_quiz.progressBar
import kotlinx.android.synthetic.main.activity_quiz.qNum
import kotlinx.android.synthetic.main.activity_quiz.questionTV
import kotlinx.android.synthetic.main.activity_quiz.quizNumTV
import kotlinx.android.synthetic.main.activity_quiz.submitBTN

class QuizType1 : AppCompatActivity(), View.OnClickListener {

    private var currentPosition: Int = 1
    private var questionList: ArrayList<QuestionModel>? = null
    private var selectedChoicePosition: Int = 0
    private var correctAnswers: Int = 0
    private var pagsasanayNum: Int = 0
    private var kwarter: Int = 0
    private var suplemental: Int = 0

    // variable for media player sounds
    private var mediaPlayer1: MediaPlayer? = null
    private var mediaPlayer2: MediaPlayer? = null
    private var mediaPlayer3: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_quiz)

        // alert dialog builder
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Panuto")
        builder.setPositiveButton("Simulan") { dialog, which -> // Do nothing
        }

        val title: String = KwarterListAdapter.topic_name

        // retrieving constants of questions
        when {
            title=="Suplemental 1" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                //getting question set
                questionList = Constants.getQuestions()
                // getting quiz info and display it )
                pagsasanayNum = 1
                quizNumTV.text = pagsasanayNum.toString()
                kwarter = 1
                suplemental = 1
                // message of dialog
                builder.setMessage("Tukuyin ang hinihinging tamang sagot sa bawat bilang.")
            }
            title=="Suplemental 5" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                //getting question set
                questionList = Constants6.getQuestions()
                // getting quiz info and display it )
                pagsasanayNum = 1
                quizNumTV.text = pagsasanayNum.toString()
                kwarter = 1
                suplemental = 5
                // message of dialog
                builder.setMessage("Basahin at unawaing mabuti ang bawat aytem. Piliin ang pinakaangkop na sagot sa bawat pahayag.")
            }
        }
        // showing app dialog
        builder.show()

        // setting question
        setQuestion()

        // on click listeners
        ch1.setOnClickListener(this)
        ch2.setOnClickListener(this)
        ch3.setOnClickListener(this)
        ch4.setOnClickListener(this)
        submitBTN.setOnClickListener(this)
        resultBTN4.setOnClickListener(this)
    }

    // Function setting question
    private fun setQuestion() {
        val question = questionList!![currentPosition - 1]
        // default view of choices
        defaultChoiceView()

        // enable choices to be clicked
        ch1.isEnabled = true
        ch2.isEnabled = true
        ch3.isEnabled = true
        ch4.isEnabled = true

        // checking if no more question then changing button text
        if (currentPosition != questionList!!.size) {
            submitBTN.text = "Sagutan"
        }

        // progress bar and text view logic
        progressBar.progress = currentPosition
        progressBar.max = questionList!!.size.toString().toInt()
        qNum.text = "$currentPosition" + " / " + questionList!!.size

        // getting question and displaying it
        questionTV.text = question!!.question

        // getting choices and displaying it
        ch1.text = question.choice1
        ch2.text = question.choice2
        ch3.text = question.choice3
        ch4.text = question.choice4

        // hiding correct image model
        correctIMG.visibility = View.INVISIBLE

        releaseMP()
    }

    // Function of displaying default view of choices
    private fun defaultChoiceView() {

        val options = ArrayList<TextView>()
        options.add(0, ch1)
        options.add(1, ch2)
        options.add(2, ch3)
        options.add(3, ch4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#292828"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    // On click function of choices
    override fun onClick(v: View?) {
        // sounds maker
        mediaPlayer1 = MediaPlayer.create(this, R.raw.button_click_sound)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.correct_sound)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.wrong_sound)

        mediaPlayer1?.start()

        when (v?.id) {
            R.id.ch1 -> {
                selectedChoiceView(ch1, 1)
            }
            R.id.ch2 -> {
                selectedChoiceView(ch2, 2)
            }
            R.id.ch3 -> {
                selectedChoiceView(ch3, 3)
            }
            R.id.ch4 -> {
                selectedChoiceView(ch4, 4)
            }
            R.id.submitBTN -> {
                if (selectedChoicePosition == 0) {

                    // checking if choices are selected
                    if (submitBTN.text == "Susunod") {
                        currentPosition++
                    }
                    else if (submitBTN.text == "Sagutan") {
                        Toast.makeText(this, "Pakiusap pumili ng sagot.", Toast.LENGTH_LONG).show()
                    }
                    // setting another set of question
                    when {
                        currentPosition <= questionList!!.size -> {
                            setQuestion()
                            // reset button text
                            submitBTN.text = "Sagutan"
                        }
                    }
                } else {
                    // getting position of question
                    val question = questionList?.get(currentPosition - 1)
                    // displaying wrong and correct answer
                    if (question!!.correctAnswer != selectedChoicePosition) {
                        answerView(selectedChoicePosition, R.drawable.wrong_option_border_bg)

                        // starting sound of wrong answer
                        mediaPlayer3?.start()

                        // for user doesn't cheat
                        selectedChoicePosition = 0
                    } else {
                        correctAnswers++
                        correctIMG.visibility = View.VISIBLE

                        // starting sound of correct answer
                        mediaPlayer2?.start()
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                    // disable choices to be clicked
                    ch1.isEnabled = false
                    ch2.isEnabled = false
                    ch3.isEnabled = false
                    ch4.isEnabled = false

                    // checking if there are more question
                    if (currentPosition >= questionList!!.size) {
                        resultBTN4.visibility = View.VISIBLE
                        submitBTN.visibility = View.INVISIBLE
                    } else {
                        submitBTN.text = "Susunod"
                    }
                    selectedChoicePosition = 0
                }
            }
            R.id.resultBTN4 -> {
                releaseMP()

                val i = Intent(this, ResultActivity::class.java)
                submitBTN.visibility = View.INVISIBLE
                i.putExtra(KWARTER, kwarter)
                i.putExtra(SUPLEMENTAL, suplemental)
                i.putExtra(PAGSASANAY, pagsasanayNum)
                i.putExtra(CORRECT_ANSWERS, correctAnswers)
                i.putExtra(TOTAL_QUESTIONS, questionList!!.size)

                startActivity(i)
            }
        }

    }

    // Function for answer view
    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                ch1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                ch2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                ch3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                ch4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    // Function of selecting choices view
    private fun selectedChoiceView(tv: TextView, selectedChoiceNum: Int) {
        // reset everything to default
        defaultChoiceView()
        if (submitBTN.text == "Sagutan") {
            selectedChoicePosition = selectedChoiceNum
        }

        tv.setTextColor(Color.parseColor("#03A9F4"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
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