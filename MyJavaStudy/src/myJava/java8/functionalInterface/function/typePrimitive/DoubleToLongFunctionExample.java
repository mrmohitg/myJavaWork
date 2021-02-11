package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionExample {

	public static void main(String[] args) {
		DoubleToLongFunction dl = (x) -> {
			return Long.MAX_VALUE - (long) x;
		};
		System.out.println(dl.applyAsLong(3.14));
	}
}