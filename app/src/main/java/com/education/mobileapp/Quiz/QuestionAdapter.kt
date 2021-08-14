package com.education.mobileapp.Quiz

// Data class adapter for questions
data class QuestionAdapter (
    val id: Int,
    val question: String,
    val choice1: String,
    val choice2: String,
    val choice3: String,
    val choice4: String,
    val correctAnswer: Int
        )