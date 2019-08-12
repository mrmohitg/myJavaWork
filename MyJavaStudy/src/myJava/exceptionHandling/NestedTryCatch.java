package myJava.exceptionHandling;

//This code represents how to use Nested Try Catch Block for different kinds of exceptions.
class NestedTryCatch {
	public static void main(String... s) {
		try {
			try {
				int z = 10 / s.length;
				System.out.println(z);
			} catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println("Please pass some array through command line arguments.");
			}
			try {
				int arr[] = new int[s.length];
				arr[10] = 1000;
				System.out.println(arr[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("You are accessing the address which is out of bound.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\4TryCatchBlock>java
 * NestedTryCatch java.lang.ArithmeticException: / by zero Please pass some
 * array through command line arguments.
 * java.lang.ArrayIndexOutOfBoundsException: 10 You are accessing the address
 * which is out of bound.
 * 
 * D:\Work\Java\Code\39ExceptionHandling\4TryCatchBlock>java NestedTryCatch 1 2
 * 3 3 java.lang.ArrayIndexOutOfBoundsException: 10 You are accessing the
 * address which is out of bound.
 */