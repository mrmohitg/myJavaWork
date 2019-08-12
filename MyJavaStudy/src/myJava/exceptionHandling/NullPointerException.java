package myJava.exceptionHandling;

//Program represents how to handle NullPointerException
public class NullPointerException {
	static String s;

	public static void main(String args[]) {
		try {
			if (s.equals("Java"))
				System.out.println("String are equal");
			else
				System.out.println("String are not equal");
		} catch (Exception e) {
			System.out.println("Panga ye hai " + e);
		}
		System.out.println("The code is still running normally after getting null pointer exception.");
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\2HandledUncheckedException>java
 * NullPointerException Panga ye hai java.lang.NullPointerException The code is
 * still running normally after getting null pointer exception.
 */