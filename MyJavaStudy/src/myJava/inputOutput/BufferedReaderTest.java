package myJava.inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedReaderTest {
	public static void main(String a[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br);
		String str;
		System.out.println("Enter Line of Text");
		System.out.println("Enter stop to quit");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}
}
