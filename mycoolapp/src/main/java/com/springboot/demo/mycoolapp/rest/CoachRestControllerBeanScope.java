package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.common.Coach;

@RestController
public class CoachRestControllerLazyBeanScope {
	
	//Define a private field for the dependency
	
	private Coach myCoach;
	
	private Coach anotherCoach;
	
	// Define a constructor for dependency injection
	
	public CoachRestControllerLazyBeanScope(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
		myCoach = theCoach;
		anotherCoach = theAnotherCoach;
	}

	@GetMapping("/dailyworkoutbeanscope")
	public String getDailyWorkout() {
		return  myCoach.getDailyWorkout();
	}
	
	@GetMapping("/check")
	public String check() {
		return "Comparing beans : myCoach == anotherCoach "+ (myCoach == anotherCoach); 
	}
}
