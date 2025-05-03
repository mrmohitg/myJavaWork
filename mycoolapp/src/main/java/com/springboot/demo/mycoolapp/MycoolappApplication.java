package com.springboot.demo.mycoolapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(scanBasePackages = {"com.springboot.demo.mycoolapp","com.springboot.demo.util"})

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(String[] args) {
		return runner -> System.out.println("Hibernate Setup");
	}

}
