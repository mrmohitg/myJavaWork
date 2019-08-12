package myJava.exceptionHandling;

//This program shows how we can throws multiple Exceptions
import java.util.*;
import java.io.*;

class Temp2 {
	int devide() throws ArithmeticException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number.");
		int x = sc.nextInt();
		System.out.println("Enter seond number.");
		int y = sc.nextInt();
		// System.out.println(x +" "+ y);
		return x / y;
	}
}

class ThrowsMultipleException {
	public static void main(String... s) {
		try {
			Temp2 obj = new Temp2();
			int result = obj.devide();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\39ExceptionHandling\9Throws>java
 * ThrowsMultipleException Enter first number. 23 Enter seond number. 0
 * java.lang.ArithmeticException: / by zero
 */