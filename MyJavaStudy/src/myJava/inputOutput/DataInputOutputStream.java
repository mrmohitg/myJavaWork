package myJava.inputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataInputOutputStream {
	public static void main(String... s) throws IOException {
		FileOutputStream fout = new FileOutputStream("Mohit.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		dout.writeInt(1000);
		dout.writeLong(10L);
		dout.writeBoolean(true);
		dout.writeDouble(10.9);
		dout.close();
		FileInputStream fin = new FileInputStream("Mohit.txt");
		@SuppressWarnings("resource")
		DataInputStream din = new DataInputStream(fin);
		System.out.println(din.readInt());
		System.out.println(din.readLong());
		System.out.println(din.readBoolean());
		System.out.println(din.readDouble());
	}
}