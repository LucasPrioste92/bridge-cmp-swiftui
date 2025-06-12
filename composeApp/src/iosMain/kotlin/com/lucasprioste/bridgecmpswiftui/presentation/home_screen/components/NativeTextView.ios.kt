package com.lucasprioste.bridgecmpswiftui.presentation.home_screen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController
import com.lucasprioste.bridgecmpswiftui.LocalNativeViewFactory
import com.lucasprioste.bridgecmpswiftui.presentation.core.utils.rememberCommonFlowState

@Composable
actual fun NativeTextView(
    modifier: Modifier,
    value: String,
) {
    val valueFlow = rememberCommonFlowState(value = value)
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        modifier = modifier,
        factory = { factory.createTextView(value = valueFlow) }
    )
}