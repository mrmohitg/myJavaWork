package myJava.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class RedirectingOutput2 {
	public static void main(String... args) throws IOException {
		FileOutputStream fout = new FileOutputStream("Chachi.txt");
		PrintStream ps = new PrintStream(fout);
		FileOutputStream fout1 = new FileOutputStream("Chacha.txt");
		PrintStream ps1 = new PrintStream(fout1);
		System.out.println("Till now the out variable of System class having reference of default PrintStream.");
		PrintStream ps4 = System.out;
		System.setOut(ps);
		System.setErr(ps1);
		System.out.println("Chachi 420");
		System.out.println("Chachi 840");
		System.err.println("Chacha 420");
		System.err.println("Chacha 840");
		// System.out=ps4; //It will give error that System.out is a final variable.
		ps4.println(
				"Now I could able to print the message on console because I have already stored the default reference of System.out variable in any other variable.");
	}
}