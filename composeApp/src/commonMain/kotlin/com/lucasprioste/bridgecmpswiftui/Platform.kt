package com.lucasprioste.bridgecmpswiftui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform