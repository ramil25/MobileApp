package com.education.mobileapp

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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