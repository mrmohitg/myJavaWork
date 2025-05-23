package myJava.inheritance.concepts;

//Calling parent class method with the super keyword
class Baase {
	void show() {
		System.out.println("Base value");
	}
}

public class MyOverriding extends Baase {
	void show() {
		System.out.println("Child value");
		super.show();
	}

	public static void main(String[] args) {
		MyOverriding obj = new MyOverriding();
		obj.show();
	}
}
/*
 * Output Child value Base value
 */
