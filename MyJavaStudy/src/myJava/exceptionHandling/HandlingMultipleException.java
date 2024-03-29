package myJava.exceptionHandling;

//WAP to handle multiple exception.
class HandlingMultipleException {
	public static void main(String args[]) {
		try {
			System.out.println("Open Files");
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45 / n;
			System.out.println("a = " + a);
			int b[] = { 10, 20, 30 };
			b[50] = 90;
		} catch (ArithmeticException ae) {
			System.out.println("Panga Ye Hai : " + ae);
		} catch (ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
			System.out.println("Problem Ye Hai : " + aie);
		} finally {
			System.out.println("Close Files");
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\6HandlingMultipleExcption>java
 * HandlingMultipleException 6 8 9 Open Files n = 3 a = 15
 * java.lang.ArrayIndexOutOfBoundsException: 50 at
 * HandlingMultipleException.main(HandlingMultipleException.java:14) Problem Ye
 * Hai : java.lang.ArrayIndexOutOfBoundsException: 50 Close Files
 */