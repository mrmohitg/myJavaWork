package myJava.java8.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p = I -> I > 10;
		System.out.println(p.test(100));

		Predicate<String> p1 = S -> S.length() > 5;
		System.out.println(p1.test("Mohit Gupta"));

		Predicate<Collection> p2 = C -> C.isEmpty();
		List<String> l = new ArrayList<>();
		l.add("Mohit");
		l.add("Anurag");
		System.out.println(p2.test(l));

		String[] names = { "Deepika", "Kareena", "Katrina", "Sunny", "Mallika", "Disha" };
		Predicate<String> p3 = S -> S.charAt(0) == 'K';
		for (String name : names)
			System.out.println(name);
		System.out.println("Heroiens whose name starts with K in the above list is ");
		for (String name : names)
			if (p3.test(name))
				System.out.println(name);

		String[] heroes = { "Shahrukh", "", "Salman", null, "Aamir" };
		Predicate<String> p4 = S -> S != null && S.length() != 0;
		for (String hero : heroes) {
			if (p4.test(hero))
				System.out.println(hero);
		}

	}

}
