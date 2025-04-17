package com.muiz.doggat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoggatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoggatApplication.class, args);

		MyFirstClass myFirstClass = new MyFirstClass();
		 System.out.println(myFirstClass.SayHello());
	}

}
