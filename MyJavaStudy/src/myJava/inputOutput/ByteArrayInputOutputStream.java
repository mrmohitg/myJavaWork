package myJava.inputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteArrayInputOutputStream {
	public static void main(String... ss) throws IOException {
		ByteArrayOutputStream fw = new ByteArrayOutputStream();
		String s = "This is Mohit Gupta. I Love JAVA.";
		byte ch[] = s.getBytes();
		for (int i = 0; i < ch.length; i++)
			fw.write(ch[i]);
		fw.writeTo(new FileOutputStream("Mohit.txt"));
		System.out.println(fw.toString());
		byte z[] = fw.toByteArray();
		ByteArrayInputStream fr = new ByteArrayInputStream(z);
		int i = 0;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
	}
}