package myJava.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class URLConnectionDemo {
	public static void main(String... args) throws IOException {
		URL google = new URL("http://www.google.com/");
		URLConnection uc = google.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
		String inputLine = " ";
		while (inputLine != null) {
			inputLine = br.readLine();
			System.out.println(inputLine);
		}
		br.close();
	}
}