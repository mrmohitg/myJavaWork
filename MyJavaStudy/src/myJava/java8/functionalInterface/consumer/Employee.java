package myJava.java8.functionalInterface.consumer;

public class Employee {
	String empName;
	double empSalary;

	public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
