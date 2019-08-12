package myJava.collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;


/**
 * @author Mohit
 *
 *This program demonstrate the hash set class
 */
class Employee
{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id * 10;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if (other.id == this.id)
			return true;
		else
			return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
	
	
}

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<>();
		System.out.println(hashSet.size());
		hashSet.add(new Employee(101));
		hashSet.add(new Employee(101));
		hashSet.add(new Employee(101));
		System.out.println(hashSet);

		Iterator<Employee> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
	}
}
