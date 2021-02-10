package myJava.java8.functionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierPassword {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String password = "";
			Supplier<Integer> si = () -> (int) (Math.random() * 10);
			String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
			Supplier<Character> sc = () -> symbol.charAt((int) (Math.random() * 30));

			for (int i = 0; i < 6; i++) {
				if (i % 2 == 0)
					password = password + si.get();
				else
					password = password + sc.get();
			}
			return password;
		};

		System.out.println("The random password generated is " + s.get());
	}

}
