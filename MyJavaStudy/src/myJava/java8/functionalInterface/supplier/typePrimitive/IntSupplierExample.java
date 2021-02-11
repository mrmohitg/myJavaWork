package myJava.java8.functionalInterface.supplier.typePrimitive;

import java.util.function.IntSupplier;

public class IntSupplierExample {

	public static void main(String[] args) {
		IntSupplier i = () -> Integer.MAX_VALUE;

		System.out.println(i.getAsInt());

	}
}