package myJava.collections.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {

		LinkedHashMap<Employee, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(new Employee(101),"Mohit");
		linkedHashMap.put(new Employee(102),"Kohit");
		linkedHashMap.put(new Employee(102),"Kohit");
		linkedHashMap.put(new Employee(102),"Rohit");
		linkedHashMap.put(new Employee(103),"Sohit");
		
		
		Set<Map.Entry<Employee,String>> set = linkedHashMap.entrySet();
		Iterator<Map.Entry<Employee,String>> iterator =set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee, String> entry = iterator.next();
			Employee key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.id +" = "+value);
		}
	}
}
