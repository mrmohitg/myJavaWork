package com.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println("In constructor : "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for 15 minutes.";
	}

}
