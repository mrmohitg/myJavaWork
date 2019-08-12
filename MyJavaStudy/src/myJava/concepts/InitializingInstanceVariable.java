package myJava.concepts;

//Initializing the instance variables.
class Personns {
	String name = "Vinit";
	int age = 30;

	void talk() {
		System.out.println("Hello I am " + name);
		System.out.println("My age is " + age);
	}
}

public class InitializingInstanceVariable {
	public static void main(String args[]) {
		Personns obj1 = new Personns();
		obj1.talk();
		Personns obj2 = new Personns();
		obj2.name = "Rohit";
		obj2.age = 25;
		obj2.talk();
		Personns obj3 = new Personns();
		obj3.talk();
	}
}
/*
 * Output Hello I am Vinit My age is 30 Hello I am Rohit My age is 25 Hello I am
 * Vinit My age is 30
 */