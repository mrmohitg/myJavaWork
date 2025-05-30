package myJava.exceptionHandling;

//This program is used for finding whose instance of child exception class is held by parent class ie Exception
class InstanceOfOperator {
	public static void main(String[] s) {
		try {
			int x = 10 / s.length;
			System.out.println(x);
			int z[] = new int[s.length];
			z[20] = 2000;
		} catch (Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("Panga Ye Hai : " + e);
			}
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Ab Galti Ye Hai : " + e);
			}
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\6HandlingMultipleExcption>java
 * InstanceOfOperator 89 89 89 3 Ab Galti Ye Hai :
 * java.lang.ArrayIndexOutOfBoundsException: 20
 */