package myJava.networking.multiClientToServer;

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
			while (true) {
				s = ss.accept();
				al.add(s);
				Runnable r = new myThread(s, al);
				Thread t = new Thread(r);
				t.start();
			}
		} catch (Exception e) {
		}
	}

	public static void main(String... s) {
		new Server();
	}
}

class myThread implements Runnable {
	Socket s;
	ArrayList<Socket> al;

	myThread(Socket s, ArrayList<Socket> al) {
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
					tellEveryone(s1);
				else {
					DataOutputStream don = new DataOutputStream(s.getOutputStream());
					don.writeUTF(s1);
					don.flush();
				}
			} while (!s.equals("Stop"));
		} catch (Exception e) {
		}
	}

	public void tellEveryone(String s1) {
		Iterator<Socket> i = al.iterator();
		while (i.hasNext())
			;
		{
			try {
				Socket sc = (Socket) i.next();
				DataOutputStream don = new DataOutputStream(sc.getOutputStream());
				don.writeUTF(s1);
				don.flush();
				System.out.println("client");
			} catch (Exception e) {
			}
		}
	}
}
