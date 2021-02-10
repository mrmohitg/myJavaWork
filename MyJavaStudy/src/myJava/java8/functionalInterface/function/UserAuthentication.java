package myJava.java8.functionalInterface.function;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthentication {

	public static void main(String ...strings)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String name = sc.nextLine();
		System.out.println("Enter password");
		String pass = sc.nextLine();
		
		Function<String,String> f = S -> S.toLowerCase();
		Function<String,String> f1 = S -> S.substring(0,5);
		
		if(f.andThen(f1).apply(name).equals("mohit") && pass.equals("pass"))
			System.out.println("Valid User");
		else
			System.out.println("Invalid user");
	}
}
