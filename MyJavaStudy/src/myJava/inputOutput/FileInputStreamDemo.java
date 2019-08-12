package myJava.inputOutput;

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
	public static void main(String... args) throws IOException {
		FileInputStream fin = new FileInputStream("Mohit.txt");
		int i = 0;
		while ((i = fin.read()) != -1)
			System.out.print((char) i);
		fin.close();
	}
}