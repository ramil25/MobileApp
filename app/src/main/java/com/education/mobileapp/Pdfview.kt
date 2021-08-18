package com.education.mobileapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.education.mobileapp.Quiz.QuizType1
import com.education.mobileapp.Quiz.QuizType2
import com.github.barteksc.pdfviewer.PDFView


class Pdfview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfview)
        val title: String = KwarterListAdapter.topic_name
        val actionBar = supportActionBar
        actionBar!!.setTitle(title)

        actionBar.setDisplayHomeAsUpEnabled(true)
        val loadpdf = findViewById<PDFView>(R.id.pdf_reader2)
        val suplemental = arrayOf("Suplemental 1","Suplemental 2","Suplemental 3","Suplemental 4","Suplemental 5")
        val pdfs =arrayOf("1_1.pdf","1_2.pdf","1_3.pdf","1_4.pdf","1_5.pdf")

        if(QuarterList.kwarter_label=="Ika-unang Kwarter") {
            var i:Int =0
            while (i<pdfs.size) {
                if (title == suplemental[i]) {
                    loadpdf.fromAsset(pdfs[i]).load()
                    i =pdfs.size
                }else{
                    i++
                }
            }
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

                val title: String = KwarterListAdapter.topic_name
                if(title=="Suplemental 1" && QuarterList.kwarter_label=="Ika-unang Kwarter") {
                    val intent = Intent(this, QuizType1::class.java)
                    startActivity(intent)
                }
                else if (title=="Suplemental 2" && QuarterList.kwarter_label=="Ika-unang Kwarter") {
                    val intent = Intent(this, QuizType2::class.java)
                    startActivity(intent)
                }

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