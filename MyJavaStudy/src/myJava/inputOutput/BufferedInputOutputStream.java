package myJava.inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedInputOutputStream {
	public static void main(String a[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("Mohit.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "India is good country.";
		byte ch[] = s.getBytes();
		fos.write(ch);
		fos.close();
		bos.close();
		FileInputStream fis = new FileInputStream("Mohit.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i = 0;
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
		bis.close();
	}
}