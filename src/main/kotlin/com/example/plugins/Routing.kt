package com.example.plugins

import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.content.*

fun Application.configureRouting() {
    routing {
        static("/static") {
            resources("html")
        }
    }
}
