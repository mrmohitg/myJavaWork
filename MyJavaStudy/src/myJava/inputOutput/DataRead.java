package myJava.inputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DataRead {
	@SuppressWarnings("deprecation")
	public static void main(String... args) throws IOException {
		FileInputStream fin = new FileInputStream("Mohit.txt");
		DataInputStream din = new DataInputStream(fin);
		String s = "";
		while (s != null) {
			s = din.readLine();
			if (s != null)
				System.out.println(s);
		}
		din.close();
	}
}