package myJava.strings.stringBuffer;

//This program shows how to add string to the existing string with the help of append method.
class StringBufferConstructor {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("StringBuffer bhai hai kya ?");
		StringBuffer s2 = s1.append(" Hai. bahi kya kaam tha?");
		System.out.println(s2);
		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
/*
 * Output StringBuffer bhai hai kya ? Hai. bahi kya kaam tha? true
 */