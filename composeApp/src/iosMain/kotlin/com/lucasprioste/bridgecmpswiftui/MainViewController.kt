package com.lucasprioste.bridgecmpswiftui

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.window.ComposeUIViewController
import com.lucasprioste.bridgecmpswiftui.presentation.App
import com.lucasprioste.bridgecmpswiftui.presentation.core.native_view.NativeViewFactory

val LocalNativeViewFactory = staticCompositionLocalOf<NativeViewFactory> {
    error("No view factory provided.")
}

fun MainViewController(
    nativeViewFactory: NativeViewFactory,
) = ComposeUIViewController {
    CompositionLocalProvider(LocalNativeViewFactory provides nativeViewFactory) {
        App()
    }
}