package com.education.mobileapp.Quiz

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class SQLiteDBHelper(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "quiz.db"

        // Table
        private val TABLE_NAME = "Score"
        private val QUIZ_NUM = "quiz"
        private val QUIZ_SCORE = "points"
        private val QUE_NUM = "items"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TBL_QUERY: String =  ("CREATE TABLE $TABLE_NAME ($QUIZ_NUM INTEGER, $QUIZ_SCORE INTEGER, $QUE_NUM INTEGER)")
        db!!.execSQL(CREATE_TBL_QUERY)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    // Insert Data
    fun insertData(score: Int, queNum: Int) {

        //var resultActivity = ResultActivity()
        //resultActivity.totalQue

        val quizNum = 1;

        // Insert data
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(QUIZ_NUM, quizNum)
        cv.put(QUIZ_SCORE, score)
        cv.put(QUE_NUM, queNum)
        var result = db.insert(TABLE_NAME, null,cv)

        if (result == -1.toLong()) {
            Toast.makeText(context, "Failed to Insert.", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(context, "Quiz Info Inserted.", Toast.LENGTH_SHORT).show()
        }
    }

}