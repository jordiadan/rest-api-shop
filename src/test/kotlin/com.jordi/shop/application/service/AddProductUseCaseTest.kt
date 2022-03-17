package com.jordi.shop.application.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddProductUseCaseTest {


    @Test
    fun `should add product`() {
        AddProductUseCase().execute()

        assertThat(true).isFalse()
    }
}