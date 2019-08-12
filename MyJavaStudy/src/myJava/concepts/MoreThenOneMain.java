package myJava.concepts;

//Overloading of main method in a Java program.
class MoreThenOneMain {
	public static void main(int s) {
		System.out.println("This will execute second.");
		System.out.println(s);
	}

	public static void main(String... s) {
		System.out.println("This will execute first.");
		main(10);
	}
}
/*
 * Output This will execute first. This will execute second. 10
 */
