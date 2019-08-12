package myJava.concepts;

//Use of boolean data type
class MyBoolean {
	public static void main(String... s) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("The value of b1 is " + b1);
		System.out.println("The value of b2 is " + b2);

		boolean b3 = !b1;
		System.out.println("The value of b3 is " + b3);

		int i = 0;
		boolean b4 = (i != 0);
		System.out.println("The value of b4 is " + b4);

		String ss = "true";
		boolean b5 = Boolean.parseBoolean(ss);
		System.out.println("The value of b5 is " + b5);

		String sss = "false";
		boolean b6 = Boolean.parseBoolean(sss);
		System.out.println("The value of b6 is " + b6);
	}
}
/*
 * Output The value of b1 is true The value of b2 is false The value of b3 is
 * false The value of b4 is false The value of b5 is true The value of b6 is
 * false
 */