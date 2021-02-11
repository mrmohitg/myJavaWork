package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {

	public static void main(String[] args) {
		DoubleFunction<String> df = (d) -> d + " is now a string";

		System.out.println(df.apply(0.5));

	}
}