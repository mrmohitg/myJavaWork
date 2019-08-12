package myJava.strings;

//This program shows concat method for the string concatination.
class ConcatinationViaConcatMethod {
	public static void main(String... ss) {
		String s1 = "good";
		String s2 = "morning";
		String s3 = s1.concat(s2);
		System.out.println("This is the concatinated string i.e. : " + s3);
		if (s1 == s2)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String>java
 * ConcatinationViaConcatMethod This is the concatinated string i.e. :
 * goodmorning false
 */