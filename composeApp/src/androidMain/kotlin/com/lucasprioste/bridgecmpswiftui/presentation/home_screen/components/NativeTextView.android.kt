package com.lucasprioste.bridgecmpswiftui.presentation.home_screen.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
actual fun NativeTextView(
    modifier: Modifier,
    value: String,
) {
    Text(
        modifier = modifier,
        text = value,
        textAlign = TextAlign.Center,
    )
}