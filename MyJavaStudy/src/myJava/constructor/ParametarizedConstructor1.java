package myJava.constructor;

//Parametrised Constructor or Non static initialization of Non static data member.
public class ParametarizedConstructor1 {
	int x;
	float y;

	ParametarizedConstructor1(int a, float b) {
		this.x = a;
		this.y = b;
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
	}

	public static void main(String args[]) {
		System.out.println("Providing Values to the class level variable by using Parametrized Constructor.");
		ParametarizedConstructor1 obj = new ParametarizedConstructor1(7, 9.5f);
	}
}
/*
 * Output Providing Values to the class level variable by using Parametrized
 * Constructor. The value of x is 7 The value of y is 9.5
 */