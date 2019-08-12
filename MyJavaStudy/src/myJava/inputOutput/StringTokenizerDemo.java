package myJava.inputOutput;

import java.io.IOException;
import java.util.StringTokenizer;

class StringTokenizerDemo {
	public static void main(String... ars) throws IOException {
		String ss = "India;Delhi;USA;Washington DC;Japan;Tokyo";
		StringTokenizer st = new StringTokenizer(ss, ";");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}