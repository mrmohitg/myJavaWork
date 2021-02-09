package myJava.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOfEmployee {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(200, "Deepika"));
		l.add(new Employee(100, "Sunny"));
		l.add(new Employee(400, "Mallika"));
		l.add(new Employee(600, "Kareena"));
		l.add(new Employee(300, "Katrina"));
		l.add(new Employee(700, "Alia"));
		l.add(new Employee(500, "Disha"));
		Collections.sort(l, (e1, e2) -> (e1.empno < e2.empno) ? -1 : (e1.empno > e2.empno) ? 1 : 0);
		System.out.println(l);

	}

}
