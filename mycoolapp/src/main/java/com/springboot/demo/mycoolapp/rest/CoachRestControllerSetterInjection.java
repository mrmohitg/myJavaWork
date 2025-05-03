package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mycoolapp.common.Coach;

@RestController
public class CoachRestControllerSetterInjection {
	
	//Define a private field for the dependency
	private Coach myCoach;
	
	@Autowired
	public void setCoach(@Qualifier("cricketCoach") Coach theCoach) {
		myCoach = theCoach;
	}
	
	/*
	@Autowired
	public void doSomething(Coach theCoach) {
		myCoach = theCoach;
	}
	*/

	@GetMapping("/dailyworkoutt")
	public String getDailyWorkout() {
		return  myCoach.getDailyWorkout();
	}
}
