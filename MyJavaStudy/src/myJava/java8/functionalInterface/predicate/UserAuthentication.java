package myJava.java8.functionalInterface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p = U -> U.userName.equalsIgnoreCase("Mohit") && U.password.equals("pwd");
		System.out.println("Enter the user name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter the password");
		String pass = sc.next();
		User userObject = new User(name, pass);
		if (p.test(userObject))
			System.out.println("Authentication Successful Welcome " + name);
		else
			System.out.println("Login Failed!");
	}

}
