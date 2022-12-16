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
                        "Cricket",
                        "Football",
                        "Table Tennis",
                        "Chess"
                    )
                ),
                title = "What is your favourite sports?",
                url = "https://images.pexels.com/photos/3628912/pexels-photo-3628912.jpeg"
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
                title = "What is your profession?",
                url = "https://images.pexels.com/photos/3628912/pexels-photo-3628912.jpeg"
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
                title = "What is your time?",
                url = "https://images.pexels.com/photos/3628912/pexels-photo-3628912.jpeg"
            ),
        )
    )
}