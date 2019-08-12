package myJava.collections.set.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class SalaryComparision implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 employee1 = (Employee1) o1;
		Employee1 employee2 = (Employee1) o2;
		if (employee1.salary > employee2.salary) {
			return 1;
		} else if(employee1.salary < employee2.salary){
			return -1;
		}
		return 0;
	}
}

class Employee1
{
	int id;
	String name;
	int salary;
	
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class TreeSetDemo3 {

	public static void main(String[] args) {
		Comparator<?> comparator = new SalaryComparision();
		@SuppressWarnings("unchecked")
		TreeSet<Employee1> treeSet =  (TreeSet<Employee1>) new TreeSet<>(comparator);
		treeSet.add(new Employee1(100, "Mohit", 1000));
		treeSet.add(new Employee1(104, "Shailender", 60000));
		treeSet.add(new Employee1(178, "Preeti", 50000));
		treeSet.add(new Employee1(234, "Yogesh", 80000));
		treeSet.add(new Employee1(564, "Manish", 40000));
		
		Iterator<Employee1> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Employee1 object = (Employee1) iterator.next();
			System.out.println(object.id +" is "+object.name + " and salary is "+object.salary);
		}
	}
}
