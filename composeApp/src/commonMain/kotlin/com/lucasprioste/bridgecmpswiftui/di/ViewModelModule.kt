package com.lucasprioste.bridgecmpswiftui.di

import com.lucasprioste.bridgecmpswiftui.presentation.home_screen.HomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewmodelModule = module {
    viewModelOf(::HomeViewModel)
}