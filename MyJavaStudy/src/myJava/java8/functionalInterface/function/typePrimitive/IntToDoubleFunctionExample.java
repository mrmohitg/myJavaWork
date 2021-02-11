package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {

	public static void main(String[] args) {
		IntToDoubleFunction i = (x) -> {
			return Math.sin(x);
		};
		System.out.println(i.applyAsDouble(2));
	}
}