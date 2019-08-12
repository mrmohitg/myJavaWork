package myJava.concepts;

//Use of method and command line arguments.
import java.io.*;

class Persoon {
	private String name;
	private int age;

	Persoon(String n, int a) {
		name = n;
		age = a;
	}

	public void check() {
		if (age <= 30)
			System.out.println(name + " is young.");
		else if (age <= 50)
			System.out.println(name + " is middle aged.");
		else
			System.out.println(name + " is old.");
	}
}

public class UseOfMethodsAndCmdLineArgs {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = args[0];
		int a = Integer.parseInt(args[1]);
		Persoon obj1 = new Persoon(n, a);
		obj1.check();
	}
}
/*
 * Output Note: Run the code with command line arguments
 * D:\Work\Java\Code\1MainFunction>java UseOfMethodsAndCmdLineArgs Mohit 23
 * Mohit is young.
 */