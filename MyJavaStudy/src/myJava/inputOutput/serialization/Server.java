package myJava.inputOutput.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Server {
	ObjectInputStream dis;

	public Server() {
		try {
			dis = new ObjectInputStream(new FileInputStream("Mohit.txt"));
			Employee z = (Employee) dis.readObject();
			System.out.println("Name = " + z.name);
			System.out.println("Age = " + z.age);
			System.out.println("a = " + z.a);
			System.out.println("b = " + z.b);
			System.out.println("z = " + z.z);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		new Server();
	}
}