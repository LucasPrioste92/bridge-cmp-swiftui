package com.lucasprioste.bridgecmpswiftui.presentation.home_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class HomeViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(HomeUIState())
    val uiState = _uiState.asStateFlow()

    private val words = listOf("kotlin", "programming", "android", "mobile", "iOS", "swift", "KMP")

    init {
        getRandomWord()
    }

    private fun getRandomWord() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.update { it.copy(randomWord = words.random()) }
            delay(duration = 10.seconds)
            getRandomWord()
        }
    }
}