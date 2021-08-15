package com.education.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.github.barteksc.pdfviewer.PDFView

class Layunin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layunin)
        val actionBar = supportActionBar
        actionBar!!.title ="Layunin"
        actionBar.setDisplayHomeAsUpEnabled(true)
        val pdfView = findViewById<PDFView>(R.id.pdf_reader)
        pdfView.fromAsset("layunin.pdf").load()
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