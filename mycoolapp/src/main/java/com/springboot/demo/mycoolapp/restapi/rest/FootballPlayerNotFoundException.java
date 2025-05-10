package com.springboot.demo.mycoolapp.restapi.rest;

public class FootballPlayerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FootballPlayerNotFoundException() {
		super();
	}

	public FootballPlayerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FootballPlayerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FootballPlayerNotFoundException(String message) {
		super(message);
	}

	public FootballPlayerNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
