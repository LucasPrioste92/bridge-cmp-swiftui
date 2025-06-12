package com.lucasprioste.bridgecmpswiftui

import android.app.Application
import com.lucasprioste.bridgecmpswiftui.di.InitDI
import org.koin.android.ext.koin.androidContext

class BridgeCMPSwiftUIApp: Application() {
    override fun onCreate() {
        super.onCreate()
        InitDI.doInit(config = { androidContext(this@BridgeCMPSwiftUIApp) })
    }
}