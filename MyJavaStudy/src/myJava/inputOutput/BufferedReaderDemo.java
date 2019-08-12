package myJava.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemo {
	public static void main(String... args) throws IOException {
		FileReader fr = new FileReader("Mohit.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		while (s != null) {
			s = br.readLine();
			if (s != null)
				System.out.println(s);
		}
	}
}