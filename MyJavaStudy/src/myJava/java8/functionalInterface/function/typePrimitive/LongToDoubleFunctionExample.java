package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {

	public static void main(String[] args) {
		LongToDoubleFunction i = (l) -> Math.sin(l);

		System.out.println(i.applyAsDouble(Long.MAX_VALUE));
	}
}