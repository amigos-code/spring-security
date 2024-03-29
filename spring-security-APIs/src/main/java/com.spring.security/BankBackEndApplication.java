package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankBackEndApplication {


	/**
	 * Once we add spring security dependency in pom.xml by default login page gets generated once we try to access any
	 * endpoint unless particular endpoint is not publicly exposed
	 * The default username is user and password is generated in console
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BankBackEndApplication.class, args);
	}

}
