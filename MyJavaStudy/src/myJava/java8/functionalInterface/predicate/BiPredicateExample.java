package myJava.java8.functionalInterface.predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> bip = (a,b) -> (a+b)%2==0;
		System.out.println(bip.test(10, 12));
	}

}
