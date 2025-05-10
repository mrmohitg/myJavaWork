package com.springboot.demo.mycoolapp.restapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PlayerRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<PlayerErrorResponse> handleException(PlayerNotFoundException exc){
		PlayerErrorResponse playerErrorResponse = new PlayerErrorResponse();
		playerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		playerErrorResponse.setMessage(exc.getMessage());
		playerErrorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(playerErrorResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<PlayerErrorResponse> handleException(Exception exc){
		PlayerErrorResponse playerErrorResponse = new PlayerErrorResponse();
		playerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		playerErrorResponse.setMessage(exc.getMessage());
		playerErrorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(playerErrorResponse, HttpStatus.BAD_REQUEST);
	}
}
