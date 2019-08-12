package myJava.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
	public static void main(String... args) throws IOException {
		FileWriter fw = new FileWriter("Mohit.txt");
		String s = "This is mohit gupta and i am the best.";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			fw.write(ch[i]);
			// fw.write(ch);
			// fw.write(s);
		}
		fw.close();
	}
}