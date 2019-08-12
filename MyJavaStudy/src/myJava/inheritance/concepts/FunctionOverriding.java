package myJava.inheritance.concepts;

//WAP to perform function overriding
class One {
	void calculate(double x) {
		System.out.println("Square value of " + x + " is " + (x * x));
	}
}

class Two extends One {
	void calculate(double x) {
		System.out.println("Square root of " + x + " is " + Math.sqrt(x));
	}
}

class FunctionOverriding {
	public static void main(String args[]) {
		One obj1 = new One();
		System.out.println("This is the output when we create parent class object on the parent reference id.");
		obj1.calculate(10.0);
		Two obj2 = new Two();
		System.out.println("This is the output when we create child class object on the child reference id.");
		obj2.calculate(100.0);
		One obj3 = new Two();
		System.out.println("This is the output when we create child class object on the parent reference id.");
		obj3.calculate(200.0);
	}
}
/*
 * Output This is the output when we create parent class object on the parent
 * reference id. Square value of 10.0 is 100.0 This is the output when we create
 * child class object on the child reference id. Square root of 100.0 is 10.0
 * This is the output when we create child class object on the parent reference
 * id.
 * 
 * Square root of 200.0 is 14.142135623730951
 */