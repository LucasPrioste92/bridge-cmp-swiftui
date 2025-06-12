package com.lucasprioste.bridgecmpswiftui.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lucasprioste.bridgecmpswiftui.presentation.home_screen.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            Box(
                modifier = Modifier
                    .safeContentPadding()
                    .fillMaxSize(),
            ) {
                HomeScreen()
            }
        }
    }
}