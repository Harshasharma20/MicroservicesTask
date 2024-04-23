package com.task.service.baseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@EnableFeignClients
//@OpenAPIDefinition
public class BaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseServiceApplication.class, args);
	}

}
