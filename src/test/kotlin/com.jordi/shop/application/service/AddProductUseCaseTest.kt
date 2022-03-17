package com.jordi.shop.application.service

import org.junit.jupiter.api.Test

class AddProductUseCaseTest {


    @Test
    fun `should add product`() {
        AddProductUseCase().execute()
    }
}