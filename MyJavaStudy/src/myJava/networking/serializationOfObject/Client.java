package myJava.networking.serializationOfObject;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
	Socket s;
	ObjectOutputStream oos;

	public Client() {
		try {
			s = new Socket("localhost", 8);
			// s = new Socket("192.168.1.210",8);
			Employee obj = new Employee("Mohit", 28);
			oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(obj);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String... args) {
		new Client();
	}
}