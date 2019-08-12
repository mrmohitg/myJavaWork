package myJava.strings;

//This programs shows comparing two strings without considering their case with the help of equalsIgnoreCase method.
public class EqualIgnoreCaseMethod {
	public static void main(String[] om) {
		String s1 = new String("hEaDsTrOnG");
		String s2 = new String("HeAdStRoNg");
		if (s1.equalsIgnoreCase(s2)) {
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
 * Output D:\Work\Java\Code\40StringHandling\1String>java EqualIgnoreCaseMethod
 * true false
 */