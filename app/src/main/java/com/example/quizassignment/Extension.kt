package com.example.quizassignment

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.viewbinding.ViewBinding

inline fun <T : ViewDataBinding> AppCompatActivity.viewBinding(
    crossinline bindingInflater: (LayoutInflater) -> T) =
    lazy(LazyThreadSafetyMode.NONE) {
        bindingInflater.invoke(layoutInflater)
    }

inline fun <T: ViewDataBinding> Fragment.viewBinding(
    crossinline bindingInflater: (LayoutInflater) -> T
){
    lazy (LazyThreadSafetyMode.NONE){
        bindingInflater.invoke(layoutInflater)
    }
}
inline fun <reified T:ViewModel> AppCompatActivity.activityViewModel() =
    lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProvider(this)[T::class.java]
    }

