package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionExample {

	public static void main(String[] args) {
		IntToLongFunction i = (x) -> Long.MAX_VALUE - x;
		System.out.println(i.applyAsLong(2));
	}
}