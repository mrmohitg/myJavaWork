package myJava.inputOutput;

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo2 {
	public static void main(String... s) throws IOException {
		FileInputStream fn = new FileInputStream("Mohit.txt");
		byte br[] = new byte[fn.available()];
		fn.read(br);
		fn.close();
		String data = new String(br);
		System.out.println(data);
	}
}