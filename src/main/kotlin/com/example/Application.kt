package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, watchPaths = listOf("Download/ktor.demo"), port = 8080, host = "localhost") {
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}
