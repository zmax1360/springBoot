package com.example.restconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class RestconsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestconsumeApplication.class, args);
	}
}
