package com.example.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllocationApplication.class, args);
	}


	@Bean
	RestTemplate restTemplate()
	{
		RestTemplate  restTemplate = new RestTemplate();
		return  restTemplate;
	}
}
