package myJava.wrapperClasses;

public class Boxing {
	public static void main(String... args) {
		int x = 10;
		Integer i;
		i = x; // Boxing is here b/c primitive type is being converted into reference type
		if (i.intValue() == x) {
			System.out.println("Boxing is OK");
		} else {
			System.out.println("Boxing is not OK");
		}
	}
}
