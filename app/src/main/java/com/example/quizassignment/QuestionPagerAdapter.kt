package com.example.quizassignment

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.quizassignment.models.Question

class QuestionPagerAdapter(
    var currentPage:Int,
    activity: AppCompatActivity,
    private val questionList: List<Question>
) : FragmentStateAdapter(
    activity
) {
    override fun getItemCount(): Int {
        return questionList.size
    }

    override fun createFragment(position: Int): Fragment {
        return QuestionFragment.newInstance(questionList[position])
    }


}