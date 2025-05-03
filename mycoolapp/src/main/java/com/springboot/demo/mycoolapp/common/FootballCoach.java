package com.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice dribbling for 15 minutes.";
	}

}
