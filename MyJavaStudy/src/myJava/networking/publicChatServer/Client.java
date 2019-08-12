package myJava.networking.publicChatServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	Socket s;
	DataOutputStream dos;
	DataInputStream dis;

	public Client() {
		try {
			s = new Socket("localhost", 10);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			clientChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clientChat() throws IOException {
		My m = new My(dis);
		Thread t1 = new Thread(m);
		t1.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do {
			s1 = br.readLine();
			dos.writeUTF(s1);
			dos.flush();
		} while (!s1.equals("stop"));
	}

	public static void main(String... args) {
		new Client();
	}
}

class My implements Runnable {
	DataInputStream dis;

	My(DataInputStream dis) {
		this.dis = dis;
	}

	public void run() {
		String s2 = " ";
		do {
			try {
				s2 = dis.readUTF();
				System.out.println(s2);
			} catch (Exception e) {
			}
		} while (!s2.equals("stop"));
	}
}
