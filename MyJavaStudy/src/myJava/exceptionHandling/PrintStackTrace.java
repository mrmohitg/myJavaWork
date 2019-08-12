package myJava.exceptionHandling;

//This program shows the use of printStackTrace method which is usefull to identify where the exception has generated.
class PrintStackTrace {
	void show() {
		int x = 10 / 0;
	}

	void display() {
		show();
	}

	void abc() {
		display();
	}

	public static void main(String... s) {
		try {
			PrintStackTrace obj = new PrintStackTrace();
			obj.abc();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\7UncheckedExpCallingChain>java
 * PrintStackTrace java.lang.ArithmeticException: / by zero at
 * PrintStackTrace.show(PrintStackTrace.java:6) at
 * PrintStackTrace.display(PrintStackTrace.java:10) at
 * PrintStackTrace.abc(PrintStackTrace.java:14) at
 * PrintStackTrace.main(PrintStackTrace.java:21)
 */