package myJava.java8.functionalInterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());

		Supplier<String> s1 = () -> {
			String[] string = { "Mohit", "Anurag", "Arnav", "Chhavi", "Neha" };
			int x = (int) (Math.random() * 4);
			return string[x];
		};

		System.out.println(s1.get());

	}

}
