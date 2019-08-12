package myJava.strings;

//This program shows the equals method of String class 
public class StringClassEqualsMethod {
	public static void main(String[] om) {
		String s = "HeadStrong";
		String s1 = new String("HeadStrong");
		String s2 = new String("HeadStrong");
		StringClassEqualsMethod t = new StringClassEqualsMethod();
		if (s.equals(s1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String>java
 * StringClassEqualsMethod true false
 */