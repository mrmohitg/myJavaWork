package myJava.java8.functionalInterface.consumer;

public class Movie {

	String name;
	String hero;
	String heroin;
	public Movie(String name, String hero, String heroin) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroin = heroin;
	}
	@Override
	public String toString() {
		return "In " + name + ", " + hero + " has loved " + heroin + ".";
	}
	
	
}
