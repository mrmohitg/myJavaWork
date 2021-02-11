package myJava.java8.functionalInterface.predicate.typePrimitive;

import java.util.function.IntPredicate;

public class IntPredicateExample {
	public static void main(String[] args) {
		// Predicate to check a value is less than 544331
		IntPredicate intPredicate = (x) -> {
			if (x <= 544331)
				return true;
			return false;
		};

		System.out.println("544331 is less than 544331 " + intPredicate.test(544331));

		// Predicate to check a value is equal to 544331
		IntPredicate predicate = (x) -> {
			if (x == 544331)
				return true;
			return false;
		};

		System.out.println("544331 is equal to 544331 " + predicate.test(544331));

		// ORing the two predicates
		IntPredicate intPredicate1 = intPredicate.or(predicate);
		System.out.println("544331 is less than equal to 544331 " + intPredicate1.test(544331));

		// ANDing the two predicates
		intPredicate1 = intPredicate.and(predicate);
		System.out.println("544331 is equal to 544331 " + intPredicate1.test(544331));

		// Negating the predicate
		intPredicate1 = intPredicate.negate();
		System.out.println("544331 is greater than 544331 " + intPredicate1.test(544331));
	}
}