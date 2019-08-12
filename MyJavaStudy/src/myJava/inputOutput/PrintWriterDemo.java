package myJava.inputOutput;

import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterDemo {
	public static void main(String... args) throws IOException {
		PrintWriter pw = new PrintWriter("Mohit2.txt");
		pw.println("This is PrintWriter Class Example");
		pw.println("This is PrintWriter Class.");
		pw.close();
		System.out.println("File Created Successfully.");
	}
}