package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}

	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}

	// Inject properties for: coach.name and team.name

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	// "/teaminfo" that return Custom Application Properties
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return coachName + " coach " + " team " + teamName;
	}

}
