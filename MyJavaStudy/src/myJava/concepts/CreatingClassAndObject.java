package myJava.concepts;

//How to create a class and object of it.
class Person {
	String name = "Mohit";
	int age = 28;

	void talk() {
		System.out.println("Hello I am " + name);
		System.out.println("My age is " + age);
	}
}

public class CreatingClassAndObject {
	public static void main(String args[]) {
		Person mohit = new Person();
		mohit.talk();
	}
}
/*
 * Output Hello I am Mohit My age is 28
 */