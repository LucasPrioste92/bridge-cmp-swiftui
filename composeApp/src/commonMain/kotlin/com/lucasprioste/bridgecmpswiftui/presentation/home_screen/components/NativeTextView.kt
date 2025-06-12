package com.lucasprioste.bridgecmpswiftui.presentation.home_screen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun NativeTextView(
    modifier: Modifier,
    value: String,
)