package com.theek.rcs

import core.module
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun testRoot() = testApplication {
        application {
            module()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
        }
    }

    @Test
    fun testWelcome() = testApplication {
        application {
            module()
        }
        client.get("/welcome").apply {
            assertEquals(HttpStatusCode.OK, status)
            val body = bodyAsText()
            assert(body.contains("Welcome"))
        }
    }

    @Test
    fun testSubscription() = testApplication {
        application {
            module()
        }
        client.get("/subscription").apply {
            assertEquals(HttpStatusCode.OK, status)
            val body = bodyAsText()
            assert(body.contains("Subscription"))
        }
    }

}
