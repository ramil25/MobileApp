package com.education.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TopicList : AppCompatActivity() {
    var title: String = QuarterList.Companion.kwarter_label
    var topic_labels: Array<String> = emptyArray();
    var rv: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_list)
        if(title=="Ika-unang Kwarter"){
           topic_labels = arrayOf("Suplemental 1")
        }
        else{
            topic_labels = arrayOf("Kasalukuyang wala pang laman")
        }
        rv = findViewById<View>(R.id.rv) as RecyclerView
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        val adapter = MyAdapater(topic_labels)
        rv!!.adapter = adapter
    }
}