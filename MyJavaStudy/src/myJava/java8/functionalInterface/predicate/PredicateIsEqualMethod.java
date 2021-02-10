package myJava.java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateIsEqualMethod {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("Mohit Gupta");
		System.out.println(p.test("Mohit Gupta"));
	}

}
