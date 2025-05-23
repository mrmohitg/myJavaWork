package myJava.constructor;

//Initializing the instance variable using a default constructor or Static initialization of non static data member
class Employee {
	String name;
	int age;
	float salary;

	Employee() {
		salary = 10000.00f;
	}

	void set(String s1, int i) {
		name = s1;
		age = i;
	}

	void get() {
		System.out.println("Hello my name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My salary is " + salary);
	}
}

public class InitializeVariableUsingConstructor {
	public static void main(String args[]) {
		Employee obj1 = new Employee();
		obj1.set("Mohit", 26);
		obj1.get();
		Employee obj2 = new Employee();
		obj2.set("Anurag", 24);
		obj2.get();
	}
}
/*
 * Output Hello my name is Mohit My age is 26 My salary is 10000.0 Hello my name
 * is Anurag My age is 24 My salary is 10000.0
 */