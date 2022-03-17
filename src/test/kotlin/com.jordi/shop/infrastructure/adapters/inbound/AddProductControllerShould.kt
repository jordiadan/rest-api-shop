package com.jordi.shop.infrastructure.adapters.inbound

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest

@Tag("integration")
@WebFluxTest(controllers = [AddProductController::class])
class AddProductControllerShould {

    @Test
    fun `add a product`() {

    }
}