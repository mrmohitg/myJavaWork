package com.springboot.demo.mycoolapp.restapi.rest;

public class PlayerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlayerNotFoundException() {
		super();
	}

	public PlayerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PlayerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PlayerNotFoundException(String message) {
		super(message);
	}

	public PlayerNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
