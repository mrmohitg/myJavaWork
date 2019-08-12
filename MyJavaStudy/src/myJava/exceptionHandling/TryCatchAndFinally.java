package myJava.exceptionHandling;

//Program represents the try catch and finnaly block in action.
class TryCatchAndFinally {
	public static void main(String args[]) {
		try {
			System.out.println("Open File.");
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45 / n;
			System.out.println("a = " + a);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Panga Ye Hai : " + ae);
			System.out.println("Please pass data while running the program.");
		} finally {
			System.out.println("Close Files");
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\5TryCatchFinallyBlock>java
 * TryCatchAndFinally Open File. n = 0 Close Files Exception in thread "main"
 * java.lang.ArithmeticException: / by zero at
 * TryCatchAndFinally.main(TryCatchAndFinally.java:11)
 * 
 * D:\Work\Java\Code\39ExceptionHandling\5TryCatchFinallyBlock>java
 * TryCatchAndFinally 5 Open File. n = 1 a = 45 Close Files
 */