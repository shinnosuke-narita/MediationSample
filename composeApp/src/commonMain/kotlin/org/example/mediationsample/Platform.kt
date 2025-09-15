package org.example.mediationsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform