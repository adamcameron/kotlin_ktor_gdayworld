import io.ktor.server.engine.*
import io.ktor.server.netty.*
import plugins.configureMonitoring
import plugins.configureRouting
import plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureMonitoring()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
