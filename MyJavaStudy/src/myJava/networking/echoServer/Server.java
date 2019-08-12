package myJava.networking.echoServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	Socket s;
	ServerSocket ss;
	DataOutputStream dos;
	DataInputStream dis;

	public Server() {
		try {
			System.out.println("Server Started");
			ss = new ServerSocket(10);
			s = ss.accept();
			System.out.println("Client Connected");
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			serverChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void serverChat() throws IOException {
		String str;
		do {
			str = dis.readUTF();
			System.out.println("Client Message : " + str);
			dos.writeUTF("Hello " + str);
		} while (!str.equals("Stop"));
	}

	public static void main(String... args) {
		new Server();
	}
}