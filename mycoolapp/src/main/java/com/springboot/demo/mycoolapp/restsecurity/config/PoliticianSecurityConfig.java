package com.springboot.demo.mycoolapp.restsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import io.swagger.v3.oas.models.PathItem.HttpMethod;

@Configuration
public class PoliticianSecurityConfig {

	private static final String EMPLOYEE_API_POLITICIANS = "/employee-api/politicians/**";
	private static final String API_POLITICIANS = "/employee-api/politicians";
	private static final String ADMIN = "ADMIN";
	private static final String MANAGER = "MANAGER";
	private static final String EMPLOYEE = "EMPLOYEE";
	private static final String NOOP_TEST123 = "{noop}test123";

	@Bean
	InMemoryUserDetailsManager userDetailsManager() {

		UserDetails namo = User.builder().username("modi").password(NOOP_TEST123).roles(EMPLOYEE, MANAGER, ADMIN)
				.build();

		UserDetails rajnath = User.builder().username("rajnath").password(NOOP_TEST123).roles(EMPLOYEE, MANAGER)
				.build();

		UserDetails amit = User.builder().username("amit").password(NOOP_TEST123).roles(EMPLOYEE).build();

		return new InMemoryUserDetailsManager(namo, rajnath, amit);
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(authCustomizer  -> authCustomizer.requestMatchers(API_POLITICIANS).permitAll()
				.requestMatchers(EMPLOYEE_API_POLITICIANS).hasRole(EMPLOYEE)
				.requestMatchers(API_POLITICIANS).hasRole(MANAGER)
				.requestMatchers(API_POLITICIANS).hasAuthority(MANAGER)
				.requestMatchers(EMPLOYEE_API_POLITICIANS).hasRole(ADMIN));

		httpSecurity.httpBasic(Customizer.withDefaults());

		httpSecurity.csrf(csrf -> csrf.disable());

		return httpSecurity.build();
	}

}
