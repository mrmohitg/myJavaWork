package myJava.java8.functionalInterface.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> listOfEmployee = new ArrayList<Employee>();
		pupulateEmployee(listOfEmployee);

		Function<List<Employee>, Double> f = List -> {
			double total = 0;
			for (Employee e : listOfEmployee) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("Total Salary of all the Girls Employees is " + f.apply(listOfEmployee));

		Predicate<Employee> p = E -> E.salary > 4000;
		Function<Employee, Employee> f1 = E -> {
			E.salary = E.salary + 10000;
			return E;
		};

		System.out.println("Before Increment Salary for all the Employees");
		for (Employee e : listOfEmployee) {
			System.out.println(e);
		}

		List<Employee> listOfEmployee1 = new ArrayList<Employee>();
		for (Employee e : listOfEmployee) {
			if (p.test(e)) {
				f1.apply(e);
				listOfEmployee1.add(e);
			}
		}

		System.out.println("After Increment Salary for Employees");
		for (Employee e : listOfEmployee1) {
			System.out.println(e);
		}
	}

	public static void pupulateEmployee(List<Employee> employeeList) {
		employeeList.add(new Employee("Deepika", 3000));
		employeeList.add(new Employee("Sunny", 10000));
		employeeList.add(new Employee("Kareena", 5000));
		employeeList.add(new Employee("Anushka", 3000));
		employeeList.add(new Employee("Katrina", 9000));
		employeeList.add(new Employee("Disha", 4000));
		employeeList.add(new Employee("Priyanka", 6000));
		employeeList.add(new Employee("Alia", 2000));

	}

}
