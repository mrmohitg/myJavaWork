package com.springboot.demo.mycoolapp.restsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class PoliticianSecurityConfig {

	private static final String EMPLOYEE = "EMPLOYEE";
	private static final String NOOP_TEST123 = "{noop}test123";

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {

		UserDetails namo = User.builder().username("modi").password(NOOP_TEST123).roles(EMPLOYEE,"MANAGER","ADMIN").build();

		UserDetails rajnath = User.builder().username("rajnath").password(NOOP_TEST123).roles(EMPLOYEE,"MANAGER").build();

		UserDetails amit = User.builder().username("amit").password(NOOP_TEST123).roles(EMPLOYEE).build();
		
		return new InMemoryUserDetailsManager(namo, rajnath, amit);
	}

}
