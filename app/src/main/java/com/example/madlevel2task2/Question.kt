package com.example.madlevel2task2

class Question (
    var question:String,
    var answer:Boolean
){
    companion object {
        val QUESTIONS = arrayOf(
            "The earth is round.",
            "This app is coded in Python.",
            "You have friends.",
            "A 'val' and 'var' are the same.",
            "Your opinion is subjective."
        )

        val QUESTION_ANSWERS = arrayOf(
            true,
            false,
            false,
            false,
            true
        )
    }
}