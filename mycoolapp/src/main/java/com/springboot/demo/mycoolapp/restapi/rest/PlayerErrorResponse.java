package com.springboot.demo.mycoolapp.restapi.rest;

public class PlayerErrorResponse {
	
	private int status;
	
	private String message;
	
	private long timeStamp;

	public PlayerErrorResponse() {
		super();
	}

	public PlayerErrorResponse(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "PlayerErrorResponse [status=" + status + ", message=" + message + ", timeStamp=" + timeStamp + "]";
	}
}
