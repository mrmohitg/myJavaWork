package myJava.networking.multiClientToServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	Socket s;
	DataInputStream dix;
	DataOutputStream dox;

	public Client() {
		try {
			s = new Socket("localhost", 10);
			// System.out.println(s);
			dix = new DataInputStream(s.getInputStream());
			dox = new DataOutputStream(s.getOutputStream());
			ClientChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ClientChat() throws IOException {
		my m = new my(dix);
		Thread t1 = new Thread(m);
		t1.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do {
			s1 = br.readLine();
			dox.writeUTF(s1);
			dox.flush();
			// System.out.println("server message"+ dix.readUTF());
		} while (!s1.equals("stop"));
	}

	public static void main(String args[]) {
		new Client();
	}
}

class my implements Runnable {
	DataInputStream dis;

	my(DataInputStream dis) {
		this.dis = dis;
	}

	public void run() {
		String s2 = "";
		do {
			try {
				s2 = dis.readUTF();
				System.out.println(s2);
			} catch (Exception e) {
			}
		} while (!s2.equals("stop"));
	}
}