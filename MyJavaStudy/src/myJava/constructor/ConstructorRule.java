package myJava.constructor;

//Constructor Rule is that before executing itself first it executes the constructor of it's parent class.
class Sample {
	Sample() {
		System.out.println("Default Constructor of Parent Class");
	}

	Sample(int x, int z) {
		System.out.println("Parametrized Constructor of Parent Class " + (x + z));
	}
}

class ConstructorRule extends Sample {
	ConstructorRule() {
		super();
		System.out.println("Default Constructor of Child Class");
	}

	ConstructorRule(int x, int z) {
		super(x, z);
		System.out.println("Parametrized Constructor of Child Class");
	}

	public static void main(String arr[]) {
		ConstructorRule a = new ConstructorRule();
		ConstructorRule a1 = new ConstructorRule(100, 300);
	}
}
/*
 * Output Default Constructor of Parent Class Default Constructor of Child Class
 * Parametrized Constructor of Parent Class 400 Parametrized Constructor of
 * Child Class
 */
