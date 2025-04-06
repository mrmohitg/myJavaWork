package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.common.Coach;

@RestController
public class CoachRestController {
	
	//Define a private field for the dependency
	private Coach myCoach;
	
	// Define a constructor for dependency injection
	public CoachRestController(Coach theCoach) {
		myCoach = theCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return  myCoach.getDailyWorkout();
	}
}
