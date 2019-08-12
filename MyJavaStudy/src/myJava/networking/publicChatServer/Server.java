package myJava.networking.publicChatServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Server {
	ArrayList<Socket> al = new ArrayList<Socket>();
	ServerSocket ss;
	Socket s;

	public Server() {
		try {
			ss = new ServerSocket(10);
			while(true) {
				s = ss.accept();
				al.add(s);
				Runnable r = new MyThread(s, al);
				Thread t = new Thread(r);
				t.start();
			}
		} catch (Exception e) {
		}
	}

	public static void main(String... args) {
		new Server();
	}
}

class MyThread implements Runnable {
	Socket s;
	ArrayList<Socket> al;

	MyThread(Socket s, ArrayList<Socket> al) {
		this.s = s;
		this.al = al;
	}

	public void run() {
		String s1;
		try {
			DataInputStream dis = new DataInputStream(s.getInputStream());
			do {
				s1 = dis.readUTF();
				System.out.println(s1);
				if (!s1.equals("stop"))
					tellEveryOne(s1);
				else {
					DataOutputStream dos = new DataOutputStream(s.getOutputStream());
					dos.writeUTF(s1);
					dos.flush();
				}
			} while (!s1.equals("stop"));
		} catch (Exception e) {
		}
	}

	public void tellEveryOne(String s1) {
		Iterator<Socket> i = al.iterator();
		while (i.hasNext()) {
			try {
				Socket sc = (Socket) i.next();
				DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
				dos.writeUTF(s1);
				dos.flush();
				System.out.println("Client");
			} catch (Exception e) {
			}
		}
	}
}