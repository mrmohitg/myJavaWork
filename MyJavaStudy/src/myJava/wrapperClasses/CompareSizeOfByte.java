package myJava.wrapperClasses;

//WAP which shows the use of Byte class objects.
import java.io.*;

class CompareSizeOfByte {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a byte no: ");
		String s1 = br.readLine();
		Byte b1 = new Byte(s1);
		System.out.println("Enter a byte no:");
		String s2 = br.readLine();
		Byte b2 = new Byte(s2);
		int n = b1.compareTo(b2);
		if (n == 0)
			System.out.println("Both bytes are same");
		else if (n < 0)
			System.out.println(b1 + " is less");
		else
			System.out.println(b2 + " is less");
	}
}