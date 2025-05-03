package com.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {

	public TrackCoach() {
		System.out.println("In constructor : "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice dragging for 15 minutes.";
	}

}
