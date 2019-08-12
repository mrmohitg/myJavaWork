package myJava.concepts;

//How to use the static methods of a java program.
class Samplee {
	static double sum(double num1, double num2) {
		double res = num1 + num2;
		return res;
	}
}

public class UsingStaticMethods {
	public static void main(String args[]) {
		double x = Samplee.sum(10, 90);
		System.out.println("Sum = " + x);
	}
}
/*
 * Output Sum = 100.0
 */