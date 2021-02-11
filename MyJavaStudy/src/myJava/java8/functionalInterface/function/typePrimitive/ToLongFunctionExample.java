package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample {

	public static void main(String[] args) {
		ToLongFunction<String> i = (x) -> Long.parseLong(x);

		System.out.println(i.applyAsLong("2"));
	}
}