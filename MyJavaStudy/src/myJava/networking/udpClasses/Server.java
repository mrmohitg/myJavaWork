package myJava.networking.udpClasses;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	public static void main(String... args) throws IOException {
		DatagramSocket ds = new DatagramSocket(8);
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		String r = new String(dp.getData());
		System.out.println(r.trim());
	}
}
