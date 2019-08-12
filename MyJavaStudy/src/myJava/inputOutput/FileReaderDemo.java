package myJava.inputOutput;

import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo {
	public static void main(String... args) throws IOException {
		FileReader fr = new FileReader("Mohit.txt");
		int i = 0;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
		fr.close();
	}
}