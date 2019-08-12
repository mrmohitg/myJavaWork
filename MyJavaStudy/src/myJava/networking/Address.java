package myJava.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

//Knowing IP Address of a website

class Address {
	public static void main(String args[]) throws IOException {
		// accept name of website from keyboard.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a website Name: ");
		String site = br.readLine();
		try {
			// getByName() method accepts site name and return it's IP Address
			InetAddress ip = InetAddress.getByName(site);
			System.out.println("The IP Address is : " + ip);
		} catch (Exception e) {
			System.out.println("Website Not Found.");
		}
	}
}