package myJava.java8.functionalInterface.function;

import java.util.function.BiFunction;

public class StaffTest {

	public static void main(String[] args) {

		BiFunction<Staff, StaffTimesheet, Double> bif = (S, ST) -> {
			return (S.dailyWages * ST.days);
		};

		Staff staff = new Staff(1, "Mohit", 5000);
		StaffTimesheet staffTimesheet = new StaffTimesheet(1, 30);

		System.out.println("Monthly salary of " + staff.name + " is " + bif.apply(staff, staffTimesheet));
	}

}
