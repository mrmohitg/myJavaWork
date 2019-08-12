package myJava.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	public static void main(String a[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("Mohit.txt");
		String s = new String("India won the world cup yesterday");
		byte b[] = s.getBytes();
		System.out.println(b[0]);
		for (int i = 0; i < b.length; i++) {
			fos.write(b[i]);
		}
		fos.close();
		FileInputStream fis = new FileInputStream("Mohit.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}
}