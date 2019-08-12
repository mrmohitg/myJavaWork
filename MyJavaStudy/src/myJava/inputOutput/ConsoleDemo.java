package myJava.inputOutput;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

class ConsoleDemo {
	public static void main(String args[]) throws IOException {
		Console c = System.console();
		if (c != null)
			System.out.println("Console is available.");
		System.out.println("Enter the line");
		String s = c.readLine();
		System.out.println(s);
		String ss = c.readLine("Enter the name (%d chars):", 5);
		System.out.println(ss);
		System.out.println("Enter Password");
		char ch[] = c.readPassword();
		char ch1[] = c.readPassword("Enter the password (%d chars):", 5);
		System.out.println(new String(ch));
		System.out.println(new String(ch1));
		// Reader r = c.reader();
		PrintWriter pw = c.writer();
		pw.println("Console");
	}
}