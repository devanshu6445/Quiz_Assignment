package com.example.quizassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.quizassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private var questionPagerAdapter: QuestionPagerAdapter? = null
    private val viewModel by activityViewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        questionPagerAdapter = viewModel.questionList.value?.let {
            QuestionPagerAdapter(
                0,
                this,
                it
            )
        }
        binding.viewPager.adapter = questionPagerAdapter
        binding.back.setOnClickListener {
            binding.viewPager.currentItem = binding.viewPager.currentItem - 1
        }
        binding.next.setOnClickListener {
            it.isEnabled = true
            binding.viewPager.currentItem = binding.viewPager.currentItem + 1
        }
        binding.viewPager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.progressIndicator.text = applicationContext.getString(
                    R.string.progress,
                    position + 1,
                    questionPagerAdapter?.itemCount
                )
                when (position) {
                    questionPagerAdapter?.itemCount?.minus(1) ?: 0 -> {
                        binding.next.isEnabled = false
                    }
                    0 -> {
                        binding.back.isEnabled = false
                    }
                    else -> {
                        binding.apply {
                            next.isEnabled = true
                            back.isEnabled = true
                        }
                    }
                }
                questionPagerAdapter?.currentPage = position
            }
        })
        binding.viewPager.isUserInputEnabled = false
    }

}