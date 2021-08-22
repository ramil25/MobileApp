package com.education.mobileapp.Quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.education.mobileapp.R
import kotlinx.android.synthetic.main.activity_quizzes_scores.*

class QuizzesScores : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizzes_scores)
        val actionBar = supportActionBar
        actionBar!!.title = "Wika'skwela"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val context = this
        var db = SQLiteDBHelper(context)

        var data = db.readData()
        tvResult.text = ""
        for(i in 0..(data.size-1)) {
            tvResult.append(data.get(i).kwarter.toString() + "-Kwarter" + "      Suplemental: " + data.get(i).supl.toString() + "\nPagsasanay: " + data.get(i).quizNum.toString() + "\nPuntos: " + data.get(i).points.toString() + "       Bilang ng Tanong: " + data.get(i).questionNum + "\n\n")
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {

                // app icon in action bar clicked; goto parent activity.
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}