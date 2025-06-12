package com.lucasprioste.bridgecmpswiftui.presentation.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.lucasprioste.bridgecmpswiftui.presentation.home_screen.components.NativeTextView
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen() {
    val viewModel = koinViewModel<HomeViewModel>()

    val uiState = viewModel.uiState.collectAsStateWithLifecycle()
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        NativeTextView(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .align(Alignment.Center),
            value = uiState.value.randomWord,
        )
    }
}