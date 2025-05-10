package com.springboot.demo.mycoolapp.restapi.entity;

public class Player {
	
	private String firstName;

	private String lastName;
	
	public Player() {
		super();
	}
	
	public Player(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
