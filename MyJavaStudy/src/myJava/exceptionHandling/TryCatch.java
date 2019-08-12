package myJava.exceptionHandling;

//This program shows how to use try catch block to handle any kind of exception.
class TryCatch {
	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception ke baad bhi program chal raha hai.");
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\4TryCatchBlock>java TryCatch
 * java.lang.ArithmeticException: / by zero Exception ke baad bhi program chal
 * raha hai.
 */