package myJava.java8.functionalInterface.unaryBinary.typePrimitive;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorExample {

	public static void main(String[] args) {
		DoubleUnaryOperator dl = (x) -> {
			return x * x;
		};
		System.out.println(dl.applyAsDouble(3.14));
	}
}