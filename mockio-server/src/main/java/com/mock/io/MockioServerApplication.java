package com.mock.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class MockioServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockioServerApplication.class, args);
	}

}
