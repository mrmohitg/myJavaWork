package com.springboot.demo.mycoolapp.restapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FootballPlayerRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<FootballPlayerErrorResponse> handleException(FootballPlayerNotFoundException exc){
		FootballPlayerErrorResponse playerErrorResponse = new FootballPlayerErrorResponse();
		playerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		playerErrorResponse.setMessage(exc.getMessage());
		playerErrorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(playerErrorResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<FootballPlayerErrorResponse> handleException(Exception exc){
		FootballPlayerErrorResponse playerErrorResponse = new FootballPlayerErrorResponse();
		playerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		playerErrorResponse.setMessage(exc.getMessage());
		playerErrorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(playerErrorResponse, HttpStatus.BAD_REQUEST);
	}
}
