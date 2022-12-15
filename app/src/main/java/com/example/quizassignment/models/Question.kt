package com.example.quizassignment.models

data class Question(
    val options: Options,
    val title : String,
){
    data class Options(
        val list: List<String>
    )
}
