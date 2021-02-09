package myJava.java8.lambdaExpression;

public class Employee {
	int empno;
	String empname;

	public Employee(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + "]";
	}

}
