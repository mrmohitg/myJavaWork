package myJava.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class RedirectingTheOutput {
	public static void main(String... args) throws IOException {
		FileOutputStream fout = new FileOutputStream("Mohit.txt");
		PrintStream ps = new PrintStream(fout);
		System.setOut(ps);
		System.out.println("We are using System.out.println() but its writing in the file instead of console.");
		PrintStream ps1 = new PrintStream(new FileOutputStream("Mohit1.txt"));
		System.setErr(ps1);
		System.err.println("We are using System.err.println() but its writing in the file instead of console.");
	}
}