package com.jordi.shop.infrastructure.configuration

import com.jordi.shop.application.service.AddProductUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun addProductUseCase() = AddProductUseCase()

}
