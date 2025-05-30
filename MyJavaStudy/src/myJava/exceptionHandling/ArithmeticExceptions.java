package myJava.exceptionHandling;

//Program represents how to handle the code from Arithmetic Exception
class ArithmeticExceptions {
	public static void main(String... args) {
		try {
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45 / n;
			System.out.println("a = " + a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("The code is still running normally.");
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\2HandledUncheckedException>java
 * ArithmeticExceptions n = 0 java.lang.ArithmeticException: / by zero The code
 * is still running normally.
 */