package myJava.exceptionHandling;

//This is the demo where program terminates due to the runtime exception. Note: It's not mandatory to use try catch block in case of unchecked esxception.
class UncheckedException {
	public static void main(String... s) {
		int y = UncheckedException.show();
		System.out.println(y);
		System.out.println("This is the normal code with no error or exception and still this is not printing.");
	}

	static int show() {
		int x = 10 / 0;
		return x;
	}
}
/*
 * Output
 * D:\Work\Java\Code\39ExceptionHandling\1UnhandledUncheckedException>java
 * UncheckedException Exception in thread "main" java.lang.ArithmeticException:
 * / by zero at UncheckedException.show(UncheckedException.java:12)
 */