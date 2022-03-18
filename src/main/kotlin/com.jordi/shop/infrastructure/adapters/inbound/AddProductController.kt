package com.jordi.shop.infrastructure.adapters.inbound

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AddProductController {

    @PostMapping("/products")
    fun addProduct() {
        println("TEST")
    }

}
