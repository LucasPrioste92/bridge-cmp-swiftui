package com.lucasprioste.bridgecmpswiftui.presentation.core.native_view

import com.lucasprioste.bridgecmpswiftui.common.core.CommonFlow
import platform.UIKit.UIViewController

interface NativeViewFactory {
    fun createTextView(
        value: CommonFlow<String>,
    ): UIViewController
}