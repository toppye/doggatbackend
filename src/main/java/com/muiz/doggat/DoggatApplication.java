package com.muiz.doggat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DoggatApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DoggatApplication.class, args);


		FirstClassTest firstClassTest = ctx.getBean(FirstClassTest.class);
		System.out.println(firstClassTest.SayHello());
	}
}
