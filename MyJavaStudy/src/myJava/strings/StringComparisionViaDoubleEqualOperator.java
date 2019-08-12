package myJava.strings;

//This program shows comparing two strings with the help of == operator
class StringComparisionViaDoubleEqualOperator {
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		if (s1 == s2) {
			System.out.println("Both are equal.");
		} else {
			System.out.println("Both are not equal.");
		}
		String s3 = "Hello";
		if (s1 == s3) {
			System.out.println("Both are equal.");
		} else {
			System.out.println("Both are not equal.");
		}
	}
}
/*
 * Output Both are not equal. Both are equal.
 */