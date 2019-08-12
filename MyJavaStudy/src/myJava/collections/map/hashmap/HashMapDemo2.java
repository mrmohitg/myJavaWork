package myJava.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee
{
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class HashMapDemo2 {

	public static void main(String[] args) {

		HashMap<String, Employee> hashMap = new HashMap<>();
		hashMap.put("100", new Employee("Mohit") );
		hashMap.put("101", new Employee("Rohit"));
		hashMap.put("102", new Employee("Sohit"));
		hashMap.put("103", new Employee("Kohit"));
		hashMap.put("104", new Employee("Kohit"));
		
		Set<Map.Entry<String,Employee>> set = hashMap.entrySet();
		Iterator<Map.Entry<String,Employee>> iterator =set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Employee> entry = iterator.next();
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println(key +" = "+value.name);
		}
	}
}
