package myJava.java8.functionalInterface.unaryBinary.typePrimitive;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {

	public static void main(String[] args) {
		IntUnaryOperator i = (x) -> x * x;
		System.out.println(i.applyAsInt(2));
	}
}