package myJava.inputOutput.serialization;

import java.io.Serializable;

public class Employee extends Base implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Base b1 = new Base();
	transient int a;
	static int b;
	String name;
	int age;

	public Employee(String name, int age, int a, int b, int z) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
		this.z = z;
	}
}