package plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import routes.indexRouting

fun Application.configureRouting() {

    routing {
        indexRouting()
    }
}
