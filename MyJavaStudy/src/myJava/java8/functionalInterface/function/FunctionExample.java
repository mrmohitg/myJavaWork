package myJava.java8.functionalInterface.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String,Integer> f = S -> S.length();
		System.out.println("The length of (Mohit Gupta) string is "+f.apply("Mohit Gupta"));
		
		Function<Integer,Integer> f1 = I -> I*I;
		System.out.println("The square of 10 is "+f1.apply(10));
		
		Function<String,String> f2 = S -> S.replaceAll(" ", "");
		System.out.println(f2.apply("Mohit Gupta Is A Boy."));
	}

}

