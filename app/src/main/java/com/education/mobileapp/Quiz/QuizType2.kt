package com.education.mobileapp.Quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.education.mobileapp.KwarterListAdapter
import com.education.mobileapp.QuarterList
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_quiz_type2.*
import kotlinx.android.synthetic.main.activity_quiz_type2.ch1
import kotlinx.android.synthetic.main.activity_quiz_type2.ch2

class QuizType2 : AppCompatActivity(), View.OnClickListener {

    private var currentPosition: Int = 1
    private var questionList: ArrayList<QuestionModel2>? = null
    private var selectedChoicePosition: Int = 0
    private var correctAnswers: Int = 0
    private var pagsasanayNum: Int = 0
    private var kwart: Int = 0
    private var supl: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_quiz_type2)

        val title: String = KwarterListAdapter.topic_name
        when {
           title=="Suplemental 2" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                // retrieving constants of questions
                questionList = Constants2.getQuestion()
                // getting quiz info number and display it
                kwart = 1
                supl = 2
                pagsasanayNum = 1
                quizNumTV1.text = pagsasanayNum.toString()
            }
        }

        ch1.setOnClickListener(this)
        ch2.setOnClickListener(this)
        submitBTN1.setOnClickListener(this)

        setQuestion()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ch1 -> {
                selectedChoiceView(ch1, 1)
            }
            R.id.ch2 -> {
                selectedChoiceView(ch2, 2)
            }
            R.id.submitBTN1 -> {
                if (selectedChoicePosition == 0) {

                    // checking if choices are selected
                    if (submitBTN1.text == "Susunod") {
                        currentPosition++
                    } else if (submitBTN1.text == "Resulta") {
                        val i = Intent(this, ResultActivity::class.java)
                        submitBTN1.visibility = View.INVISIBLE
                        i.putExtra(KWARTER, kwart)
                        i.putExtra(SUPLEMENTAL, supl)
                        i.putExtra(PAGSASANAY, pagsasanayNum)
                        i.putExtra(CORRECT_ANSWERS, correctAnswers)
                        i.putExtra(TOTAL_QUESTIONS, questionList!!.size)

                        startActivity(i)
                    } else if (submitBTN1.text == "Sagutan") {
                        Toast.makeText(this, "Pakiusap pumili ng sagot.", Toast.LENGTH_LONG).show()
                    }
                    // setting another set of question
                    when {
                        currentPosition <= questionList!!.size -> {
                            setQuestion()
                            // reset button text
                            submitBTN1.text = "Sagutan"
                        }
                    }
                } else {
                    // getting position of question
                    val question = questionList?.get(currentPosition - 1)
                    // displaying wrong and correct answer
                    if (question!!.correctAnswer != selectedChoicePosition) {
                        answerView(selectedChoicePosition, R.drawable.wrong_option_border_bg)

                        // for user doesn't cheat
                        selectedChoicePosition = 0
                    } else {
                        correctAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    // checking if there are more question
                    if (currentPosition >= questionList!!.size) {
                        submitBTN1.setBackgroundColor(Color.parseColor("#03A9F4"))
                        submitBTN1.text = "Resulta"
                    } else {
                        submitBTN1.text = "Susunod"
                    }
                    selectedChoicePosition = 0
                }
            }
        }
    }

    // Function setting question
    private fun setQuestion() {
        val question = questionList!![currentPosition - 1]
        // default view of choices
        defaultChoiceView()

        // checking if no more question then changing button text
        if (currentPosition != questionList!!.size) {
            submitBTN1.text = "Sagutan"
        }

        // progress bar and text view logic
        progressBar1.progress = currentPosition
        progressBar1.max = questionList!!.size.toString().toInt()
        qNum1.text = "$currentPosition" + " / " + questionList!!.size

        // getting question and displaying it
        questionTV1.text = question!!.question

        // getting choices and displaying it
        ch1.text = question.choice1
        ch2.text = question.choice2
    }

    // Function of displaying default view of choices
    private fun defaultChoiceView() {

        val options = ArrayList<TextView>()
        options.add(0, ch1)
        options.add(1, ch2)

        for (option in options) {
            option.setTextColor(Color.parseColor("#292828"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
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
        }
    }

    // Function of selecting choices view
    private fun selectedChoiceView(tv: TextView, selectedChoiceNum: Int) {
        // reset everything to default
        defaultChoiceView()
        if (submitBTN1.text == "Sagutan") {
            selectedChoicePosition = selectedChoiceNum
        }

        tv.setTextColor(Color.parseColor("#03A9F4"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }
}