package myJava.collections.map.sortedmap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


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

class SalaryComparison implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 employee1 = (Employee1)o1;
		Employee1 employee2 = (Employee1)o2;
		if(employee1.salary > employee2.salary)
			return 1;
		else if(employee1.salary < employee2.salary)
			return -1;
		else
			return 0;
	}
}

public class TreeMapDemo3 {
	public static void main(String[] args) {
		Comparator<Object> comparator = new SalaryComparison();
		TreeMap<Employee1, String> treemap = new TreeMap<>(comparator);
		treemap.put(new Employee1(101, "Nikhil", 90000),"1004");
		treemap.put(new Employee1(102, "Mohit", 30000),"1002");
		treemap.put(new Employee1(103, "Anurag", 60000),"1001");
		treemap.put(new Employee1(105, "Vipul", 100000),"1005");
		treemap.put(new Employee1(104, "Nishant", 80000),"1003");
		
		Set<Entry<Employee1,String>> set = treemap.entrySet();
		Iterator<Entry<Employee1,String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee1,String> entry = iterator.next();
			System.out.println(entry.getKey().id +" - "+ entry.getKey().name+" - "+entry.getKey().salary+" - "+entry.getValue());
		}
	}
}
