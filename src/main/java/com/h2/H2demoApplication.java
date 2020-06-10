package com.h2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class H2demoApplication {

	private static final Logger log = LoggerFactory.getLogger(H2demoApplication.class);

  	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
	
}
