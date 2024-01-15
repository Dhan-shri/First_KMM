package com.dhanshri.firstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform