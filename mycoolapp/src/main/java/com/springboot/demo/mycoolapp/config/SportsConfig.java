package com.springboot.demo.mycoolapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.demo.mycoolapp.common.Coach;
import com.springboot.demo.mycoolapp.common.SwimCoach;

@Configuration
public class SportsConfig {

    @Bean
    Coach swimCoach() {
		return new SwimCoach();
	}

}
