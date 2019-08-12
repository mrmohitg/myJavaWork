package myJava.inputOutput;

import java.io.IOException;
import java.util.Scanner;

class ScannerDemo1 {
	public static void main(String... args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = sc.nextDouble();
		float f = sc.nextFloat();
		long l = sc.nextLong();
		System.out.println(i + d + f + l);
		sc.close();
		
	}
}