package com.example.quizassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizassignment.databinding.FragmentQuestionBinding
import com.example.quizassignment.models.Question

class QuestionFragment(
    private val question: Question
) : Fragment(){

    private var binding : FragmentQuestionBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuestionBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.questionTitle?.text = question.title
        binding?.apply {
            option1.text = question.options.list[0]
            option2.text = question.options.list[1]
            option3.text = question.options.list[2]
            option4.text = question.options.list[3]
        }
    }

    companion object{
        fun newInstance(question: Question): QuestionFragment{
            return QuestionFragment(question)
        }
    }
}