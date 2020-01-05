package com.microservice.phonekart.requestmappingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservice.phonekart.requestmappingservice.controller")
public class RequestMappingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestMappingServiceApplication.class, args);
	}

}
