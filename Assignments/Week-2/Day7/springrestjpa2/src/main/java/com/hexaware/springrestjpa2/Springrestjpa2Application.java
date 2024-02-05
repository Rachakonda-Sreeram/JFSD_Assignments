package com.hexaware.springrestjpa2;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Springrestjpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springrestjpa2Application.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}