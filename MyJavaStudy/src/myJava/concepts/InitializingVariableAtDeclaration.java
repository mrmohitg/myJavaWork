package myJava.concepts;

//Initializing the instance variable at the time of declaration.
class Personn {
	private String name = "Mohit";
	private int age = 25;

	void talk() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
	}
}

public class InitializingVariableAtDeclaration {
	public static void main(String args[]) {
		Personn obj1 = new Personn();
		obj1.talk();
		Personn obj2 = new Personn();
		obj2.talk();
	}
}
/*
 * Output My name is Mohit My age is 25 My name is Mohit My age is 25
 */