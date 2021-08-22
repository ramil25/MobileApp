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
        val TABLE_NAME = "Score"
        val KWARTER = "kwarter"
        val SUPLEMENTAL = "suplemental"
        val QUIZ_NUM = "quiz"
        val QUIZ_SCORE = "points"
        val QUE_NUM = "items"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TBL_QUERY: String =  ("CREATE TABLE $TABLE_NAME ($KWARTER INTEGER, $SUPLEMENTAL INTEGER, $QUIZ_NUM INTEGER, $QUIZ_SCORE INTEGER, $QUE_NUM INTEGER)")
        db!!.execSQL(CREATE_TBL_QUERY)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    // Insert Data
    fun insertData(kwarter: Int, supl: Int, quizNum: Int, score: Int, queNum: Int) {

        // Insert data
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(KWARTER, kwarter)
        cv.put(SUPLEMENTAL, supl)
        cv.put(QUIZ_NUM, quizNum)
        cv.put(QUIZ_SCORE, score)
        cv.put(QUE_NUM, queNum)
        var result = db.insert(TABLE_NAME, null,cv)

        if (result == -1.toLong()) {
           // Toast.makeText(context, "Failed to Insert.", Toast.LENGTH_SHORT).show()
        }
        else {
           // Toast.makeText(context, "Quiz Info Inserted.", Toast.LENGTH_SHORT).show()
        }
    }

    fun readData() : MutableList<QuizInfo> {
        var list: MutableList<QuizInfo> = ArrayList()

        val db = this.readableDatabase
        val query = "SELECT * FROM " + TABLE_NAME
        val result = db.rawQuery(query, null)

        if(result.moveToFirst()) {
            do {
                var quizInfo = QuizInfo()
                quizInfo.kwarter = result.getString(result.getColumnIndex(KWARTER)).toInt()
                quizInfo.supl = result.getString(result.getColumnIndex(SUPLEMENTAL)).toInt()
                quizInfo.quizNum = result.getString(result.getColumnIndex(QUIZ_NUM)).toInt()
                quizInfo.points = result.getString(result.getColumnIndex(QUIZ_SCORE)).toInt()
                quizInfo.questionNum = result.getString(result.getColumnIndex(QUE_NUM)).toInt()
                list.add(quizInfo)
            } while (result.moveToNext())
        }
        result.close()
        db.close()

        return list
    }

}