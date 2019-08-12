package myJava.inputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyStream {
	@SuppressWarnings("deprecation")
	public static void main(String a[]) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fio = new FileOutputStream("abc.txt");
		DataOutputStream dos = new DataOutputStream(fio);
		String s = " ";
		while (!s.equals("stop")) {
			s = dis.readLine();
			dos.writeBytes(s);
			System.out.println();
			dos.flush();
		}
		dis.close();
		fio.close();
	}
}