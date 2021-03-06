package myJava.exceptionHandling;

//This program shows we can use only try with finally block.
class TryWithFinally {
	void fun() {
		try {
			int x = 7;
			int y = x / 0;
			System.out.println(y);
		} finally {
			System.out.println(
					"Finally block is executing at the end even if the exception is not handled by the programmer.");
		}
	}

	public static void main(String args[]) {
		TryWithFinally obj = new TryWithFinally();
		obj.fun();
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\5TryCatchFinallyBlock>java
 * TryWithFinally Finally block is executing at the end even if the exception is
 * not handled by the programmer. Exception in thread "main"
 * java.lang.ArithmeticException: / by zero at
 * TryWithFinally.fun(TryWithFinally.java:9) at
 * TryWithFinally.main(TryWithFinally.java:20)
 */