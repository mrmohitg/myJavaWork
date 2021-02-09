package myJava.java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class SoftwareEngineerTest {

	public static void main(String[] args) {

		SoftwareEngineer[] listOfEngineers = { new SoftwareEngineer("Mohit", 33, true),
				new SoftwareEngineer("Anurag", 30, true), new SoftwareEngineer("Arnav", 33, false),
				new SoftwareEngineer("Nishant", 20, true) };

		Predicate<SoftwareEngineer> p = SE -> (SE.age >= 30 && SE.isHavingGirlFriend == true);
		Predicate<SoftwareEngineer> p1 = p.negate();

		for (SoftwareEngineer se : listOfEngineers) {
			if (p.test(se)) {
				System.out.println(se);
			}
		}

	}

}
