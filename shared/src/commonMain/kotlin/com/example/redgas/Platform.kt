package com.example.redgas

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform