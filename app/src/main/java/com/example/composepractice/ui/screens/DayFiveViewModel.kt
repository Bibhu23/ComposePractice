package com.example.composepractice.ui.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DayFiveViewModel : ViewModel(){
    // 1. State variable (MutableStateFlow)
    private val _count= MutableStateFlow(0);
    val count: StateFlow<Int> = _count.asStateFlow()
    // 2. Business logic function
    fun increment(){
        _count.value++
    }
}
