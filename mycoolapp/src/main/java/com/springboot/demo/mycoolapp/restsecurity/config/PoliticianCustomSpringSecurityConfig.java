package com.springboot.demo.mycoolapp.restsecurity.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class PoliticianCustomSpringSecurityConfig {

	private static final String EMPLOYEE_API_POLITICIANS = "/employee-api/politicians/**";
	private static final String API_POLITICIANS = "/employee-api/politicians";
	private static final String HELLO_THYMELEAF = "/employee-api/helloThymeleafs";
	private static final String ADMIN = "ADMIN";
	private static final String MANAGER = "MANAGER";

	@Bean
	UserDetailsManager userDetailsManager(DataSource datasource) {
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(datasource);

		jdbcUserDetailsManager.setUsersByUsernameQuery("SELECT user_id, pw, active FROM members WHERE user_id=?");

		jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("SELECT user_id, role FROM roles WHERE user_id=?");

		return jdbcUserDetailsManager;
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(authCustomizer  -> authCustomizer.requestMatchers(API_POLITICIANS).permitAll()
				.requestMatchers(HELLO_THYMELEAF).permitAll()
				.requestMatchers(EMPLOYEE_API_POLITICIANS).hasRole(ADMIN)
				.requestMatchers(API_POLITICIANS).hasRole(MANAGER)
				.requestMatchers(API_POLITICIANS).hasAuthority(MANAGER)
				.requestMatchers(EMPLOYEE_API_POLITICIANS).hasRole(ADMIN));

		httpSecurity.httpBasic(Customizer.withDefaults());

		httpSecurity.csrf(csrf -> csrf.disable());

		return httpSecurity.build();
	}

}
