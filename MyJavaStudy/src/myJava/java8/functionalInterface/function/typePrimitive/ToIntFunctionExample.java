package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {

	public static void main(String[] args) {
		ToIntFunction<String> i = (x) -> Integer.parseInt(x);

		System.out.println(i.applyAsInt("2"));
	}
}