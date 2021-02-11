package myJava.java8.functionalInterface.unaryBinary.typePrimitive;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorExample {

	public static void main(String[] args) {
		LongUnaryOperator i = (l) -> -l;

		System.out.println(i.applyAsLong(Long.MAX_VALUE));
	}
}