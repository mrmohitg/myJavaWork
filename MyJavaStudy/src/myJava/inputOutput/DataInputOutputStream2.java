package myJava.inputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class DataInputOutputStream2 {
	@SuppressWarnings("deprecation")
	public static void main(String... args) throws IOException {
		FileOutputStream fout = new FileOutputStream("Mohit.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		DataInputStream din = new DataInputStream(System.in);
		PrintStream ps = new PrintStream(dout);
		String s = "";
		while (!s.equals("stop")) {
			s = din.readLine();
			System.out.println(s);
			// dout.writeBytes(s); dout.writeChars(s); dout.writeUTF(s);
			dout.writeBytes(s);
			// ps.println(s);
			ps.flush();
		}
		din.close();
		dout.close();
	}
}