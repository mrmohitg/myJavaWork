package myJava.inputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;

class SequenceIStream {
	public static void main(String... args) throws IOException {
		// SequenceInputStream sin = new SequenceInputStream(new
		// FileInputStream("Mohit.txt"), new FileInputStream("Mohit1.txt"));
		SequenceInputStream sin = new SequenceInputStream(new MyEnum());
		DataInputStream din = new DataInputStream(sin);
		String s = "";
		while (s != null) {
			s = din.readLine();
			if (s != null)
				System.out.println(s);
		}
		din.close();
	}
}

class MyEnum implements Enumeration {
	InputStream in[];
	int i = 0;

	MyEnum() {
		try {
			in = new InputStream[] { new FileInputStream("Mohit.txt"), new FileInputStream("Mohit1.txt"),
					new FileInputStream("Mohit2.txt") };
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean hasMoreElements() {
		if (i < in.length)
			return true;
		else
			return false;
	}

	public Object nextElement() {
		return in[i++];
	}
}