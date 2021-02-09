package myJava.java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		int[] x = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("The complete series of number is ");
		System.out.println(x);
		Predicate<Integer> p1 = I -> I > 40;
		System.out.println("The numbers greater then 40 are ");
		m1(p1, x);
		Predicate<Integer> p2 = I -> I % 2 == 0;
		System.out.println("The even numbers are ");
		m1(p2, x);
		System.out.println("The numbers greater then 40 and even numbers are ");
		m1(p1.and(p2), x);
		System.out.println("The numbers greater then 40 and even numbers are ");
		m1(p1.or(p2), x);
		System.out.println("The number which is less then 40 are ");
		m1(p1.negate(), x);
	}

}
