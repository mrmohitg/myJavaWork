package com.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice dragging for 15 minutes.";
	}

}
