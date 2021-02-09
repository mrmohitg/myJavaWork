package myJava.java8.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee("Mohit", "SE", 50000, "Noida"));
		listOfEmployee.add(new Employee("Anurag", "MD", 150000, "Noida"));
		listOfEmployee.add(new Employee("Arnav", "DE", 5000, "Gurgaon"));
		listOfEmployee.add(new Employee("Chhavi", "FF", 60000, "Delhi"));

		Predicate<Employee> p = E -> E.city.equalsIgnoreCase("Noida");

		System.out.println("List of employees who is working from Noida");
		for (Employee e : listOfEmployee) {
			if (p.test(e))
				System.out.println(e);
		}

		Predicate<Employee> p1 = E -> E.salary > 40000;
		System.out.println("List of employees whose salary is greater then 40000");
		for (Employee e : listOfEmployee) {
			if (p1.test(e))
				System.out.println(e);
		}

		Predicate<Employee> p2 = p.and(p1);
		System.out.println("List of employees who is working from Noida and salary is greater then 40000");
		for (Employee e : listOfEmployee) {
			if (p2.test(e))
				System.out.println(e);
		}

	}

}
