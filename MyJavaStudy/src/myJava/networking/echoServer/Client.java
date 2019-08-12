package myJava.networking.echoServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;

	public Client() {
		try {
			s = new Socket("localhost", 10);
			System.out.println(s);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			clientChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clientChat() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do {
			s1 = br.readLine();
			dos.writeUTF(s1);
			dos.flush();
			System.out.println("Server Message : " + dis.readUTF());
		} while (!s1.equals("stop"));
	}

	public static void main(String... args) {
		new Client();
	}
}