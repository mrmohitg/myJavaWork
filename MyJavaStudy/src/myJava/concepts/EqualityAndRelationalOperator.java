package myJava.concepts;

//Using relational operator
class EqualityAndRelationalOperator {
	public static void main(String... s) {
		int x = 10, y = 20, z = 30;
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		if (x == y) {
			System.out.println("Values of x and y are equal.");
		} else {
			System.out.println("Values of x and y are different.");
		}
		if (y != z) {
			System.out.println("Value of y and z are different.");
		} else {
			System.out.println("Value of y and z are equal.");
		}

		if (x < y) {
			if (x < z) {
				System.out.println("The x is smallest.");
			} else {
				System.out.println("The z is smallest.");
			}
		} else {
			if (y < z) {
				System.out.println("The y is smallest.");
			} else {
				System.out.println("The z is smallest.");
			}
		}
	}
}
/*
 * Output x = 10, y = 20, z = 30 Values of x and y are different. Value of y and
 * z are different. The x is smallest.
 */