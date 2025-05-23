package myJava.inheritance.concepts;

//Data Hiding concept is working.
class Demo {
	int x = 100;

	Demo() {
		this(7);
		System.out.println("Constructor of Parent Demo");
	}

	Demo(int i1) {
		this(8, 9);
		System.out.println(i1);
	}

	Demo(int i1, int i2) {
		System.out.println(i1);
		System.out.println(i2);
	}

	public void getC() {
		System.out.println("Method of parent class");
	}
}

class DataHiding extends Demo {
	int x = 200;

	DataHiding() {
		super(23);
		System.out.println("Constructor of DataHiding");
	}

	public void getD() {
		int x = 300;
		System.out.println("Method of child class");
		System.out.println("Local variable: " + x);
		System.out.println("Child class variable:" + this.x);// Data Shadowing.............
		System.out.println("Parent class variable: " + super.x);// Data Hiding............
	}

	public static void main(String arr[]) {
		DataHiding obj = new DataHiding();
		obj.getC();
		obj.getD();
	}
}
/*
 * Output 8 9 23 Constructor of DataHiding Method of parent class Method of
 * child class Local variable: 300 Child class variable:200 Parent class
 * variable: 100
 */
