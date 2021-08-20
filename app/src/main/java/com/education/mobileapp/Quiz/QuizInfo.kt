package com.education.mobileapp.Quiz

class QuizInfo {

    var kwarter: Int = 0
    var supl: Int = 0
    var quizNum: Int = 0
    var points: Int = 0
    var questionNum: Int = 0

    constructor(kwarter: Int, supl: Int, quizNum: Int,points: Int, questionNum: Int) {
        this.kwarter = kwarter
        this.supl = supl
        this.quizNum = quizNum
        this.points = points
        this.questionNum = questionNum
    }
    constructor() {

    }
}