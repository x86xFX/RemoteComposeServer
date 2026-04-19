package core

import presentation.screens.subscriptionScreen
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Welcome to Remote Compose Server!")
        }

        get("/welcome") {

        }

        get("/subscription") {
            val screen = subscriptionScreen()
            call.response.header(HttpHeaders.ContentLength, screen.size.toString())
            call.respondBytes(
                bytes = screen,
                contentType = ContentType.Application.OctetStream
            )
        }

        get("/leave") {

        }
    }
}