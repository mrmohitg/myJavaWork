package myJava.java8.functionalInterface.predicate.typePrimitive;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {
	public static void main(String[] args) {
		// DoublePredicate to check square
		// of x is less than 100
		DoublePredicate db = (x) -> {
			return x * x < 100.0;
		};
		System.out.println("100 is less than 100 " + db.test(10));

		DoublePredicate db3;
		// Test condition reversed
		db.negate();
		System.out.println("100 is greater than 100 " + db.test(10));

		DoublePredicate db2 = (x) -> {
			double y = x * x;
			return y >= 36 && y < 1000;
		};

		// Test condition ANDed
		// with another predicate
		db3 = db.and(db2);
		System.out.println("81 is less than 100 " + db3.test(9));

		db3 = db.or(db2);
		// Test condition ORed with another predicate
		System.out.println("49 is greater than 36" + " and less than 100 " + db3.test(7));
	}
}