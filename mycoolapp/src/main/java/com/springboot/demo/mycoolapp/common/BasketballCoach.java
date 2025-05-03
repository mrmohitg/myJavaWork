package com.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice basket for 15 minutes.";
	}

	// defining our init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("We are in doMyStartupStuff() " + getClass().getSimpleName());
	}

	// defining our destroy method
	@PreDestroy
	public void doMyEndupStuff() {
		System.out.println("We are in doMyEndupStuff() " + getClass().getSimpleName());
	}

}
