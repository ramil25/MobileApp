package com.education.mobileapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.education.mobileapp.Quiz.QuizActivity
import com.github.barteksc.pdfviewer.PDFView


class Pdfview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfview)
        val title: String = KwarterListAdapter.topic_name
        val actionBar = supportActionBar
        actionBar!!.setTitle(title)

        actionBar.setDisplayHomeAsUpEnabled(true)
        val gg = findViewById<PDFView>(R.id.pdf_reader2)
        if(title=="Suplemental 1" && QuarterList.kwarter_label=="Ika-unang Kwarter") {
            gg.fromAsset("1_1.pdf").load()
        }
    }
        //button listener
    fun watchVideo(view: View) {
        val intent = Intent(applicationContext,VideoViewer::class.java)
            startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {

                // app icon in action bar clicked; goto parent activity.
                finish()
                true
            }
            // selected item for button
            R.id.pagsusulitBTN -> {
                val intent = Intent(this, QuizActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_item_actionbar, menu)
        return true
    }

}