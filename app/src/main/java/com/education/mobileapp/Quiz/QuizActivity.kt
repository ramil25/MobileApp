package com.education.mobileapp.Quiz

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity(), View.OnClickListener {

    private var currentPosition: Int = 1
    private var questionList: ArrayList<QuestionAdapter>? = null
    private var selectedChoicePosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        // retrieving constants of questions
        questionList = Constants.getQuestions()

        setQuestion()

        // on click listeners
        ch1.setOnClickListener(this)
        ch2.setOnClickListener(this)
        ch3.setOnClickListener(this)
        ch4.setOnClickListener(this)
        submitBTN.setOnClickListener(this)
    }

    // Function setting question
    private fun setQuestion() {
        val question = questionList!![currentPosition-1]
        // default view of choices
        defaultChoiceView()

        // checking if no more question then changing button text
        if(currentPosition != questionList!!.size) {
            submitBTN.text = "Sagutan"
        }

        // progress bar and text view logic
        progressBar.progress = currentPosition
        qNum.text = "$currentPosition" + "/" + progressBar.max

        // getting question and displaying it
        questionTV.text = question!!.question

        // getting choices and displaying it
        ch1.text =question.choice1
        ch2.text =question.choice2
        ch3.text =question.choice3
        ch4.text =question.choice4
    }

    // Function of displaying default view of choices
    private fun defaultChoiceView() {

        val options = ArrayList<TextView>()
        options.add(0, ch1)
        options.add(1, ch2)
        options.add(2, ch3)
        options.add(3, ch4)

        for(option in options) {
            option.setTextColor(Color.parseColor("#292828"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    // On click function of choices
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.ch1 -> { selectedChoiceView(ch1, 1)}
            R.id.ch2 -> { selectedChoiceView(ch2, 2)}
            R.id.ch3 -> { selectedChoiceView(ch3, 3)}
            R.id.ch4 -> { selectedChoiceView(ch4, 4)}
            R.id.submitBTN -> {
                if(selectedChoicePosition == 0) {
                    currentPosition ++

                    // checking if there are more question
                    when {
                        currentPosition <= questionList!!.size -> {
                        setQuestion()
                        }
                        else -> { Toast.makeText(this, "Pagtatapos ng pagsasanay.", Toast.LENGTH_LONG).show() }
                    }
                }
                else {
                    // getting position of question
                    val question = questionList?.get(currentPosition - 1)
                    // displaying wrong and correct answer
                    if(question!!.correctAnswer != selectedChoicePosition) {
                        answerView(selectedChoicePosition, R.drawable.wrong_option_border_bg)
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    // checking if there are more question
                    if(currentPosition >= questionList!!.size) {
                        submitBTN.text = "Resulta"
                    } else {
                        submitBTN.text = "Susunod"
                    }
                    selectedChoicePosition = 0
                }
            }
        }
    }

    // Function for answer view
    private fun answerView(answer: Int, drawableView: Int) {
        when(answer) {
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
        selectedChoicePosition = selectedChoiceNum

        tv.setTextColor(Color.parseColor("#03A9F4"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }
}