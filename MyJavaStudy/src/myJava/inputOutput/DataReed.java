package myJava.inputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DataReed {
	@SuppressWarnings("deprecation")
	public static void main(String... args) throws IOException {
		DataInputStream din = new DataInputStream(new FileInputStream("Mohit.txt"));
		String s = " ";
		while (s != null) {
			s = din.readLine();
			if (s != null)
				System.out.println(s);
		}
		din.close();
	}
}