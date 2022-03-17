package com.jordi.shop.infrastructure.adapters.inbound

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

@Tag("integration")
@WebFluxTest(controllers = [AddProductController::class])
class AddProductControllerShould {

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun `add a product`() {
        val response = webTestClient
            .post()
            .uri("/products")
            .contentType(MediaType.APPLICATION_JSON)
            .exchange()

        response.expectStatus()
    }
}