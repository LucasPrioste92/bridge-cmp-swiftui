package com.lucasprioste.bridgecmpswiftui.presentation.core.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import com.lucasprioste.bridgecmpswiftui.common.core.CommonFlow
import com.lucasprioste.bridgecmpswiftui.common.core.toCommonFlow
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun <T> rememberCommonFlowState(
    value: T,
    vararg keys: Any? = arrayOf(value),
): CommonFlow<T> {
    val flow = remember { MutableStateFlow(value) }
    LaunchedEffect(*keys) {
        flow.emit(value)
    }
    return flow.toCommonFlow()
}