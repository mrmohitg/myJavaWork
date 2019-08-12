package myJava.networking.serializationOfObject;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;
	Socket s;
	ObjectInputStream ois;

	public Server() {
		try {
			System.out.println("Server Started.");
			ss = new ServerSocket(8);
			s = ss.accept();
			System.out.println("Client Started");
			ois = new ObjectInputStream(s.getInputStream());
			Employee obj1 = (Employee) ois.readObject();
			obj1.show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		new Server();
	}
}