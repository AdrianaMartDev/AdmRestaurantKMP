package com.example.admrestaurantkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform