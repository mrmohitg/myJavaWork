package com.springboot.demo.mycoolapp.restsecurity.config;

//import javax.sql.DataSource;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class PoliticianSpringSecurityConfig {
/*
	private static final String EMPLOYEE_API_POLITICIANS = "/employee-api/politicians/**";
	private static final String API_POLITICIANS = "/employee-api/politicians";
	private static final String ADMIN = "ADMIN";
	private static final String MANAGER = "MANAGER";
	
	@Bean
	UserDetailsManager userDetailsManager(DataSource datasource) {
		return new JdbcUserDetailsManager(datasource);
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(authCustomizer  -> authCustomizer.requestMatchers(API_POLITICIANS).permitAll()
				.requestMatchers(EMPLOYEE_API_POLITICIANS).hasRole(ADMIN)
				.requestMatchers(API_POLITICIANS).hasRole(MANAGER)
				.requestMatchers(API_POLITICIANS).hasAuthority(MANAGER)
				.requestMatchers(EMPLOYEE_API_POLITICIANS).hasRole(ADMIN));

		httpSecurity.httpBasic(Customizer.withDefaults());

		httpSecurity.csrf(csrf -> csrf.disable());

		return httpSecurity.build();
	}
*/
}
