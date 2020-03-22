package com.scau.learnshufa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.scau.learnshufa.mapper")
@SpringBootApplication
public class LearnshufaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnshufaApplication.class, args);
	}

}
