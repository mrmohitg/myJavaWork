package myJava.strings.stringBuffer;

//This program shows how to use append method.
import java.io.*;

public class StringBufferDemo {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter First name : ");
			String fir = br.readLine();
			System.out.println("Enter Middle name : ");
			String mid = br.readLine();
			System.out.println("Enter Last name : ");
			String last = br.readLine();
			StringBuffer sb = new StringBuffer(fir);
			sb.append(mid);
			sb.append(last);
			System.out.println("Name = " + sb);
			int n = fir.length();
			sb.insert(n, "Jr");
			System.out.println("Full name= " + sb);
			System.out.println("In reverse=" + sb.reverse());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\2StringBuffer>java StringBufferDemo
 * Enter First name : Mohit Enter Middle name : kumar Enter Last name : Gupta
 * Name = MohitkumarGupta Full name= MohitJrkumarGupta In
 * reverse=atpuGramukrJtihoM
 */