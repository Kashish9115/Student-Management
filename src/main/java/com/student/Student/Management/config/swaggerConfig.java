package com.student.Student.Management.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class swaggerConfig {

    @Bean
    public OpenAPI myFunction(){
        return new OpenAPI().info(
                new Info().title("Student management API").description("By Kashish")
        );
    }




}
