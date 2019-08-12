package myJava.inputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

class StreamTokenizerDemo {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream("Mohit.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		StreamTokenizer st = new StreamTokenizer(isr);
		st.eolIsSignificant(true);
		st.wordChars(33, 255);
		st.whitespaceChars(0, 32);
		int token = 0;
		int count = 0;
		while (true) {
			token = st.nextToken();
			if (token == StreamTokenizer.TT_EOF)
				break;
			if (token == StreamTokenizer.TT_NUMBER)
				System.out.println(st.nval + "Number");
			if (token == StreamTokenizer.TT_WORD)
				System.out.println(st.sval + "Word");
			count++;
		}
		System.out.println("No. of words in  file =" + count);
	}
}