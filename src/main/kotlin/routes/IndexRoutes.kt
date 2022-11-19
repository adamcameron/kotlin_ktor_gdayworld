package routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.indexRouting() {
    route("/") {
        get {
            call.respondText("Hello World!")
        }
    }
}