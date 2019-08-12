package myJava.networking.udpClasses;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Client {
	public static void main(String... args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		String s = "India is a good country.";
		byte b[] = s.getBytes();
		InetAddress inet = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(b, b.length, inet, 8);
		ds.send(dp);
	}
}