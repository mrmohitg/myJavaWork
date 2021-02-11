package myJava.java8.functionalInterface.supplier.typePrimitive;

import java.util.function.LongSupplier;

public class LongSupplierExample {

	public static void main(String[] args) {
		LongSupplier i = () -> Long.MAX_VALUE;

		System.out.println(i.getAsLong());
	}
}