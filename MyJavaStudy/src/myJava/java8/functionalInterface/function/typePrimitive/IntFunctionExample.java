package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.IntFunction;

public class IntFunctionExample {

	public static void main(String[] args) {
		IntFunction<String> i = (x) -> Integer.toString(x);

		System.out.println(i.apply(3).length());

	}
}