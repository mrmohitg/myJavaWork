package myJava.concepts;

//Conditional operator &&, ||
class ConditionalOperator {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		if (x < z && y < z) {
			System.out.println("The value of both x and y are less then z.");
		} else {
			System.out.println("The value of z is not greater then x and y.");
		}
		if (y > x || y > z) {
			System.out.println("The value of y is greater then either x or z.");
		} else {
			System.out.println("The value of y is not greater then either x or z.");
		}
	}
}
/*
 * Output x = 10, y = 20, z = 30 The value of both x and y are less then z. The
 * value of y is greater then either x or z.
 */