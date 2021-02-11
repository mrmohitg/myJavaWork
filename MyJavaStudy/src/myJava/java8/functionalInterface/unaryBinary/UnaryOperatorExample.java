package myJava.java8.functionalInterface.unaryBinary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<String> i = (x) -> x.toUpperCase();

		System.out.println(i.apply("Mohit Gupta"));
	}
}