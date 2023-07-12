package com.project.service.webapi.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI applyOpenAPI() {
        return new OpenAPI().info(new Info()
            .title("A CRUD in Rest API")
            .description("Quickstart project in Spring Boot")
            .version("1.0")
        );
    }

}
