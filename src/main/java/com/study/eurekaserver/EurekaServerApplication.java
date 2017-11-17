package com.study.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("hello wordld");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
