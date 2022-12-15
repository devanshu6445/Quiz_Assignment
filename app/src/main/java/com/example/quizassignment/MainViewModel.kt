package com.example.quizassignment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quizassignment.models.Question

class MainViewModel: ViewModel() {

    val questionList = MutableLiveData(
        listOf(
            Question(
                Question.Options(
                    listOf(
                        "Yellow",
                        "Blue",
                        "Black",
                        "White"
                    )
                ),
                title = "What is your favourite color?"
            ),
            Question(
                Question.Options(
                    listOf(
                        "Student",
                        "Teacher",
                        "Developer",
                        "Accountant"
                    )
                ),
                title = "What is your profession?"
            ),
            Question(
                Question.Options(
                    listOf(
                        "Early morning",
                        "Morning",
                        "Afternoon",
                        "Night"
                    )
                ),
                title = "What is your time?"
            ),
        )
    )
}