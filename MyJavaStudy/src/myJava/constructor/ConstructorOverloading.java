package myJava.constructor;

//ConstructorOverloading
public class ConstructorOverloading {
	public ConstructorOverloading() {
		System.out.println("This is Constructor overloading.");
	}

	public ConstructorOverloading(int x) {
		System.out.println("This is Single Parametarized Constructor " + x);
	}

	public ConstructorOverloading(int x, int y) {
		System.out.println("This is Dual parametarized Constructor " + (x + y));
	}

	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(10);
		new ConstructorOverloading(10, 20);
	}
}
/*
 * Output This is Constructor overloading. This is Single Parametarized
 * Constructor 10 This is Dual parametarized Constructor 30
 */
