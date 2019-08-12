package myJava.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

//Connecting to www.yahoo.com and retting the details.

class Details {
	public static void main(String args[]) throws IOException {
		// Pass the site URL to URL object.
		URL obj = new URL("http://www.yahoo.com/index.html");
		// Open a connection with the site on Internet.
		URLConnection conn = obj.openConnection();
		// Display the date
		System.out.println("Date: " + new Date(conn.getDate()));
		// Display the content type whether text or html
		System.out.println("Content-Type: " + conn.getContentType());
		// Display expiry date
		System.out.println("Expiry: " + conn.getExpiration());
		// Display last modified date
		System.out.println("Last Modified: " + new Date(conn.getLastModified()));
		// Display how many bytes the index.html page has
		int l = conn.getContentLength();
		System.out.println("Length of content: " + l);
		if (l == 0) {
			System.out.println("Content not available.");
			return;
		} else {
			int ch;
			InputStream in = conn.getInputStream();
			// Display the content of the index.html page.
			while ((ch = in.read()) != -1)
				System.out.println((char) ch);
		}
	}
}