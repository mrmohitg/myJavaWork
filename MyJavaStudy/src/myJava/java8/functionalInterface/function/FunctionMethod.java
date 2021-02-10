package myJava.java8.functionalInterface.function;

import java.util.function.Function;

public class FunctionMethod {

	public static void main(String[] args) {

		Function<String, String> f = Function.identity();
		System.out.println(f.apply("Mohit"));
	}

}
