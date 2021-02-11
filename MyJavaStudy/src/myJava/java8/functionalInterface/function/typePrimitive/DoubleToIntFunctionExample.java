package myJava.java8.functionalInterface.function.typePrimitive;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample {

	public static void main(String[] args) {
		DoubleToIntFunction df = (x) -> {
			return (int) x + 2;
		};

		System.out.println(df.applyAsInt(3.14));
	}
}