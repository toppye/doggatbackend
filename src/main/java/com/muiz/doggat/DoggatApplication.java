package com.muiz.doggat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DoggatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoggatApplication.class, args);
		System.out.println("DoggatApplication started");
	}
}
