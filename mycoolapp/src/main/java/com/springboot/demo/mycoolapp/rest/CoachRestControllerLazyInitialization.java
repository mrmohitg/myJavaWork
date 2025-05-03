package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.common.Coach;

@RestController
public class CoachRestControllerLazyInitialization {
	
	//Define a private field for the dependency
	
	private Coach myCoach;
	
	// Define a constructor for dependency injection
	
	public CoachRestControllerLazyInitialization(@Qualifier("trackCoach") Coach theCoach) {
		myCoach = theCoach;
	}

	@GetMapping("/dailyworkoutlazyinitialization")
	public String getDailyWorkout() {
		return  myCoach.getDailyWorkout();
	}
}
