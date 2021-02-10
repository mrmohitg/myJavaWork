package myJava.java8.functionalInterface.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {

		String s = "Aishwaryaabhi";

		Function<String, String> f = S -> S.toUpperCase();
		Function<String, String> f1 = S -> S.substring(0, 9);

		System.out.println(f.apply(s));
		System.out.println(f1.apply(s));

		System.out.println(f.andThen(f1).apply(s));
		System.out.println(f.compose(f1).apply(s));

		Function<Integer, Integer> f2 = I -> I + I;
		Function<Integer, Integer> f3 = I -> I * I * I;

		System.out.println(f2.andThen(f3).apply(5));
		System.out.println(f2.compose(f3).apply(5));

	}

}
