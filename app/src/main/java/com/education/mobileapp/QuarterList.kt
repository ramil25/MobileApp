package com.education.mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button

class QuarterList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarter_list)
        val actionBar = supportActionBar
        actionBar!!.title="Pumili ng Kwarter"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    //Kwarters Buttons
    fun openKwarterTopic(view:View){
        var btn = view as Button
        kwarter_label = btn.text.toString()
        val i = Intent(applicationContext,TopicList::class.java)
        startActivity(i)
    }
    //back button click
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

    companion object{
        var kwarter_label ="";

    }
}