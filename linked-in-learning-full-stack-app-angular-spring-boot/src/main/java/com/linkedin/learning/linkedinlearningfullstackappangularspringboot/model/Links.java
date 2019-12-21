package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model;

public class Links {

	private Self self;

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	public Links(Self self) {
		super();
		this.self = self;
	}
	
	
}
