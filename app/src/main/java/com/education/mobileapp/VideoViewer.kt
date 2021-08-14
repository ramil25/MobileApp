package com.education.mobileapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import java.net.URI

class VideoViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_viewer)
        val vv = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setMediaPlayer(vv)
        vv.setMediaController(mediaController)
        vv.setVideoURI(Uri.parse("android.resource://$packageName/raw/vs1"))
        vv.start()
    }
}