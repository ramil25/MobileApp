package com.education.mobileapp

import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.MediaController
import android.widget.VideoView
import java.net.URI

class VideoViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newConfig: Configuration
        setContentView(R.layout.activity_video_viewer)
        val actionBar =supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.title =QuarterList.kwarter_label
        val vv = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        var orientation:Int = resources.configuration.orientation
        newConfig = Configuration(this.resources.configuration)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            actionBar!!.hide()
        }
        mediaController.setMediaPlayer(vv)
        vv.setMediaController(mediaController)
        vv.setVideoURI(Uri.parse("android.resource://$packageName/raw/vs1"))
        vv.start()
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