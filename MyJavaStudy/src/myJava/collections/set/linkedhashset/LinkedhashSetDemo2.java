package myJava.collections.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Employee
{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		return true;
	}
	
	
}

public class LinkedhashSetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet<Employee> linkedhashSet = new LinkedHashSet<>();
		System.out.println(linkedhashSet.size());
		linkedhashSet.add(new Employee(100));
		linkedhashSet.add(new Employee(100));
		linkedhashSet.add(new Employee(100));
		
		System.out.println(linkedhashSet.size());
		System.out.println(linkedhashSet);
		
		Iterator<Employee> iterator = linkedhashSet.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.id);
		}
	}

}
