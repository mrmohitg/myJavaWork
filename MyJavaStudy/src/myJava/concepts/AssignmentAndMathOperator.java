package myJava.concepts;

// Assignment and Arithmetic operator
class AssignmentAndMathOperator {
	public static void main(String... s) {
		int var = 10;
		int res;
		System.out.println("The value of var is " + var);
		res = var + 5;
		System.out.println(var + " + 5 = " + res);
		res = var - 5;
		System.out.println(var + " - 5 = " + res);
		res = var * 5;
		System.out.println(var + " * 5 = " + res);
		res = var / 5;
		System.out.println(var + " / 5 = " + res);
		res = var % 5;
		System.out.println(var + " % 5 = " + res);
	}
}
/*
 * Output The value of var is 10 10 + 5 = 15 10 - 5 = 5 10 * 5 = 50 10 / 5 = 2
 * 10 % 5 = 0
 */