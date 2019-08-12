package myJava.inputOutput;

import java.io.IOException;
import java.util.Scanner;

class ScannerDemo {
	public static void main(String... s) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s1 = " ";
		while (!s1.equals("stop")) {
			s1 = sc.nextLine();
			System.out.println(s1);
		}
		sc.close();
	}
}