package acceptance

import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldStartWith
import io.ktor.http.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import plugins.configureRouting
import org.junit.jupiter.api.DisplayName

@DisplayName("Tests of the / route")
class ApplicationTest {
    @Test
    fun `Tests the root route responds with the correct status and message`() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            status shouldBe HttpStatusCode.OK
            bodyAsText() shouldBe "Hello World!"
        }
    }
}