package myJava.strings;

//This program shows how we can get the reference of the String class object which is made in String Constant Pool. 
class InternMethod {
	public static void main(String a[]) {
		String s = new String("abc");
		String s1 = s.intern();
		String s2 = "abc";
		if (s == s1) {
			System.out.println("True");
		} else if (s1 == s2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
/*
 * Output True
 */