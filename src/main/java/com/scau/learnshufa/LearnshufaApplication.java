package com.scau.learnshufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LearnshufaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnshufaApplication.class, args);
	}

}
