package myJava.inputOutput.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Client {
	ObjectOutputStream dout;

	public Client() {
		try {
			Employee e1 = new Employee("Mohit", 10, 20, 30, 40);
			dout = new ObjectOutputStream(new FileOutputStream("Mohit.txt"));
			dout.writeObject(e1);
			dout.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		new Client();
	}
}