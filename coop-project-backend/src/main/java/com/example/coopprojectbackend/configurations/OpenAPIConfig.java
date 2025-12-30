package com.example.coopprojectbackend.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI openAPIPersonalizzato() {
        return new OpenAPI()
                .info(new Info()
                        .title("MTG collections")
                        .version("1.0")
                        .description("API creata per gestire un micro db di carte di magic."));
    }
}