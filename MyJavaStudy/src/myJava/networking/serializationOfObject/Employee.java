
package myJava.networking.serializationOfObject;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void show() {
		System.out.println("Employee name is " + name + " and his/her age is " + age);
	}
}