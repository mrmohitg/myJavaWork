package myJava.concepts;

//Calling methods without parameters but with return types.
class Saample {
	private double num1, num2;

	Saample(double x, double y) {
		num1 = x;
		num2 = y;
	}

	double sum() {
		return num1 + num2;
	}
}

public class MethodWithoutArgsButWithReturnType {
	public static void main(String args[]) {
		Saample obj1 = new Saample(10, 10);
		double result = obj1.sum();
		System.out.println("The sum of the digits are " + result);
	}
}
/*
 * Output The sum of the digits are 20.0
 */