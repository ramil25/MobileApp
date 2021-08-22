package com.education.mobileapp.Quiz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.education.mobileapp.KwarterListAdapter
import com.education.mobileapp.QuarterList
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_quiz_type5.*

class QuizType5 : AppCompatActivity(), View.OnClickListener {

    private var correctAnswers: Int = 0
    private var pagsasanayNum: Int = 0
    private var kwart: Int = 0
    private var supl: Int = 0
    private var hasNextQuiz = 0

    private var questions: Array<String> = arrayOf()
    private var answers: Array<String> = arrayOf()
    private var queNum: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_type5)
        supportActionBar!!.hide()

        // set the question
        setQuestion()

        // on click
        submitBTN5.setOnClickListener(this)
        resultBTN5.setOnClickListener(this)
    }

    // Function for setting the question
    private fun setQuestion() {

        val title: String = KwarterListAdapter.topic_name

        when {
            title=="Suplemental 4" && QuarterList.kwarter_label=="Ika-unang Kwarter" -> {
                // quiz info
                pagsasanayNum = 2
                quizNumTV4.text = pagsasanayNum.toString()
                kwart = 1
                supl = 4
                hasNextQuiz = 0
                // setting array of questions
                questions = arrayOf(
                    "At sa huli, ihain ang masarap na ginataan habang mainit o puwede ring palamigin muna bago ihain.",
                    "Hayaan pang makulo at maluto ang bilo – bilo, kamote, saging, at langka ng mga limang minuto. Timplahan ng asukal ayon sa panlasa.",
                    "Kapag nagsimula nang umangat ang bilo – bilo sa kumukulong gata at tubig ay ilagay ang hiniwa – hiwang kamote at hayaang maluto nang kaunti.",
                    "Pagkatapos ng apat na minutong pagkaluto ng saging na saba ay sunod na ilagay ang langka.",
                    "Sunod na ihulog sa pinakukulong gata at tubig ang mumunting bilo – bilo.",
                    "Ikalawa, magpakulo ng pinaghalong gata ng niyog at tubig sa isang Kaserola. Halo – haluin hanggang sa kumulo.",
                    "Tingnan kung medyo malambot na ang kamote, ilagay naman ang hiniwa – hiwang saging na saba. Hayaang kumulo pa nang apat na minuto.",
                    "Una, ihanda ang bilo – bilo sa pamamagitan ng paghahalo ng giniling na malagkit na bigkas at tubig. Bilugan ang tig – kalahating kutsari – tang malagkit na tila mumunting bola. Itabi muna ang bilo – bilo."
                )
                queNum = questions.size
                // setting array of answers
                answers = arrayOf("8", "7", "4", "6", "3", "2", "5", "1")
            }
        }

        // get and display the questions at text view
        que1TV.text = questions[0]
        que2TV.text = questions[1]
        que3TV.text = questions[2]
        que4TV.text = questions[3]
        que5TV.text = questions[4]
        que6TV.text = questions[5]
        que7TV.text = questions[6]
        que8TV.text = questions[7]

        // get and display correct answers at text view
        correctAnsTV1.text = answers[0]
        correctAnsTV2.text = answers[1]
        correctAnsTV3.text = answers[2]
        correctAnsTV4.text = answers[3]
        correctAnsTV5.text = answers[4]
        correctAnsTV6.text = answers[5]
        correctAnsTV7.text = answers[6]
        correctAnsTV8.text = answers[7]
    }

    // On click function
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.submitBTN5 -> {

                if (answer1ET.text.toString() != "" && answer2ET.text.toString() != "" && answer3ET.text.toString() != "" &&
                    answer4ET.text.toString() != "" && answer5ET.text.toString() != "" && answer6ET.text.toString() != "" &&
                    answer7ET.text.toString() != "" && answer8ET.text.toString() != "") {

                    if (answer1ET.text.toString() == correctAnsTV1.text) {
                        answer1ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer1ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer1ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer2ET.text.toString() == correctAnsTV2.text) {
                        answer2ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer2ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer2ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer3ET.text.toString() == correctAnsTV3.text) {
                        answer3ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer3ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer3ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer4ET.text.toString() == correctAnsTV4.text) {
                        answer4ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer4ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer4ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer5ET.text.toString() == correctAnsTV5.text) {
                        answer5ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer5ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer5ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer6ET.text.toString() == correctAnsTV6.text) {
                        answer6ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer6ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer6ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer7ET.text.toString() == correctAnsTV7.text) {
                        answer7ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer7ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer7ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }
                    if (answer8ET.text.toString() == correctAnsTV8.text) {
                        answer8ET.setBackgroundResource(R.drawable.correct_option_border_bg)
                        answer8ET.setTextColor(Color.parseColor("#03A9F4"))
                        correctAnswers++
                    } else {
                        answer8ET.setBackgroundResource(R.drawable.wrong_option_border_bg)
                    }

                    displayCorrectAnswers()
                    disableEditText()
                    submitBTN5.visibility = View.INVISIBLE
                    resultBTN5.visibility = View.VISIBLE

                } else {
                    Toast.makeText(this, "Pakiusap wag iwanan na walang laman ang sagutan bago ipasa.", Toast.LENGTH_LONG).show()
                }
            }
            R.id.resultBTN5 -> {
                val i = Intent(this, ResultActivity::class.java)
                i.putExtra(KWARTER, kwart)
                i.putExtra(SUPLEMENTAL, supl)
                i.putExtra(PAGSASANAY, pagsasanayNum)
                i.putExtra(CORRECT_ANSWERS, correctAnswers)
                i.putExtra(TOTAL_QUESTIONS, queNum)
                i.putExtra(HAS_NEXT_QUIZ, hasNextQuiz)

                startActivity(i)
            }
        }
    }

    // Function for displaying correct answer after the submit of the quiz
    private fun displayCorrectAnswers() {
        correctAnsTV1.visibility = View.VISIBLE
        correctAnsTV2.visibility = View.VISIBLE
        correctAnsTV3.visibility = View.VISIBLE
        correctAnsTV4.visibility = View.VISIBLE
        correctAnsTV5.visibility = View.VISIBLE
        correctAnsTV6.visibility = View.VISIBLE
        correctAnsTV7.visibility = View.VISIBLE
        correctAnsTV8.visibility = View.VISIBLE
    }

    // Function for disabling edit text to be answered again
    private fun disableEditText() {
        answer1ET.isEnabled = false
        answer2ET.isEnabled = false
        answer3ET.isEnabled = false
        answer4ET.isEnabled = false
        answer5ET.isEnabled = false
        answer6ET.isEnabled = false
        answer7ET.isEnabled = false
        answer8ET.isEnabled = false
    }
}