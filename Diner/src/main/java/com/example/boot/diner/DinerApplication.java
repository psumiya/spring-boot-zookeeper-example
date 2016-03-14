package com.example.boot.diner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DinerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DinerApplication.class, args);
	}
}
