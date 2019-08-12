package myJava.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Object>
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee) o;
		if (this.salary > employee.salary) {
			return 1;
		} else if (this.salary < employee.salary) {
			return -1;
		} else
			return 0;
	}
}

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<>();
		System.out.println(treeSet.size());
		treeSet.add(new Employee(100, "Mohit", 1000));
		treeSet.add(new Employee(104, "Shailender", 60000));
		treeSet.add(new Employee(178, "Preeti", 50000));
		treeSet.add(new Employee(234, "Yogesh", 80000));
		treeSet.add(new Employee(564, "Manish", 40000));
		System.out.println(treeSet);
		Iterator<Employee> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.id+" is "+employee.name+" and his salary is "+employee.salary);
		}
	}

}
