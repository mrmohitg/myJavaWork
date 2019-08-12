package myJava.inputOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import myJava.inputOutput.serialization.Employee;

public class Client implements Serializable {
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