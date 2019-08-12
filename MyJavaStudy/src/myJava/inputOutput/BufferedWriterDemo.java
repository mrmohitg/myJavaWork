package myJava.inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class BufferedWriterDemo {
	public static void main(String... args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("Mohit.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		String s = "";
		while (!s.equals("stop")) {
			s = br.readLine();
			// bw.write(s);
			// bw.write("");
			pw.println(s);
			// bw.flush();
		}
		br.close();
		bw.close();
		fw.close();
	}
}