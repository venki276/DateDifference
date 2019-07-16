package com.webapp.thymeleaf.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.webapp.thymeleaf")
public class TwoDatesAppBoot {

	public static void main(String[] args) {
		SpringApplication.run(TwoDatesAppBoot.class, args);		
	}

}
