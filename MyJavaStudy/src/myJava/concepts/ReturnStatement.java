package myJava.concepts;

//using return statements
public class ReturnStatement {
	public static void main(String args[]) {
		int result = myMethod(5);
		System.out.println("The square of the number is " + result);
	}

	static int myMethod(int x) {
		return x * x;
	}
}
/*
 * Output The square of the number is 25
 */