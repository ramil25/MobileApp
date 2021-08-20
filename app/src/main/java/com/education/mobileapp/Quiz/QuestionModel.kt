package com.education.mobileapp.Quiz

// Data class adapter for questions
data class QuestionModel (
    val id: Int,
    val question: String,
    val choice1: String,
    val choice2: String,
    val choice3: String,
    val choice4: String,
    val correctAnswer: Int
        )

data class QuestionModel2 (
    val id: Int,
    val question: String,
    val choice1: String,
    val choice2: String,
    val correctAnswer: Int
        )

data class QuestionModel3 (
    val id: Int,
    val queston: String,
    val correctAnswer: String
        )

data class QuestionModel4 (
    val id: Int,
    val question: String,
    val correctAnswer: String,
    val choice1: String,
    val choice2: String,
    val choice3: String,
    val choice4: String,
    val choice5: String,
    val choice6: String,
    val choice7: String,
    val choice8: String,
    val choice9: String,
    val choice10: String
        )