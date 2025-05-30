package myJava.constructor;

//Constructor Chaining in action we use special symbol of 'this()' to work constructor chaining.
class ConstructorChaining {
	ConstructorChaining() {
		this(2);
		System.out.println("No Arguments");
	}

	ConstructorChaining(int i1) {
		this(4, 5);
		System.out.println("One Arguments " + i1);
	}

	ConstructorChaining(int i1, int i2) {
		this(5, 7, 8);
		System.out.println("Two Arguments " + (i1 + i2));
	}

	ConstructorChaining(int i1, int i2, int i3) {
		this(5, 7, 8, 4);
		System.out.println("three Arguments " + (i1 + i2 + i3));
	}

	ConstructorChaining(int i1, int i2, int i3, int i4) {
		System.out.println("Four Arguments " + (i1 + i2 + i3 + i4));
	}

	public static void main(String arr[]) {
		new ConstructorChaining();
	}
}
/*
 * Output Four Arguments 24 three Arguments 20 Two Arguments 9 One Arguments 2
 * No Arguments
 */