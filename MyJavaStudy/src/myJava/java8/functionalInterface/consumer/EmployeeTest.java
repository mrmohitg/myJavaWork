package myJava.java8.functionalInterface.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeTest {

	public static void main(String[] args) {

		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		populateEmployee(listOfEmployee);
		BiFunction<String, Double, Employee> bif = (S, D) -> {
			return new Employee(S, D);
		};

		BiConsumer<Employee, Integer> bic = (E, I) -> {
			E.empSalary = E.empSalary + I;
			System.out.println(E.empName);
			System.out.println(E.empSalary);
		};
		bif.apply("Mohit", (double) 10000);

		for (Employee e : listOfEmployee) {
			bic.accept(e, 5000);
		}
	}

	public static void populateEmployee(ArrayList<Employee> list) {
		list.add(new Employee("Mohit", 34534));
		list.add(new Employee("Anurag", 36788));
		list.add(new Employee("Nikhil", 3434));
		list.add(new Employee("Vipul", 3534));
		list.add(new Employee("Nishant", 3374));
		list.add(new Employee("Arnav", 334));
		list.add(new Employee("Swati", 3474));
	}

}
