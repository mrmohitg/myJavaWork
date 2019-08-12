package myJava.inputOutput;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

class CharArrayReaderWriterDemo {
	public static void main(String... args) throws IOException {
		CharArrayWriter caw = new CharArrayWriter();
		String s = "India is a good country.";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			caw.write(ch[i]);
			// caw.write(ch);
			// caw.write(s);
		}
		caw.writeTo(new FileWriter("Mohit1.txt"));
		System.out.println(caw.toString());
		char z[] = caw.toCharArray();
		CharArrayReader fr = new CharArrayReader(z);
		int i = 0;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
	}
}