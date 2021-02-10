package myJava.java8.functionalInterface.function;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<Integer,Integer,Integer> bif = (i,j) -> i*j;
		System.out.println(bif.apply(10, 20));
	}

}
