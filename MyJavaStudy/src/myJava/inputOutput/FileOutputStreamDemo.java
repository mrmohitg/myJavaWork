package myJava.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
	public static void main(String... s) throws IOException {
		FileOutputStream fout = new FileOutputStream("Mohit.txt");
		String text = "This is Mohit.";
		byte ch[] = text.getBytes();
		for (int i = 0; i < ch.length; i++) {
			fout.write(ch[i]);
		}
		fout.close();
		System.out.println("File Created Successfully.");
	}
}