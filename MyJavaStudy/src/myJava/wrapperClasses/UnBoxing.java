package myJava.wrapperClasses;

public class UnBoxing {
	public static void main(String... args) {
		int x = 10;
		Integer i = new Integer(10);
		int y = i.intValue(); // Boxing is here b/c primitive type is being converted into reference type
		if (y == x) {
			System.out.println("UnBoxing is OK");
		} else {
			System.out.println("UnBoxing is not OK");
		}
	}
}
