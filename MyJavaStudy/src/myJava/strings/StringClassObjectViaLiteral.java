package myJava.strings;

//This program is used to create String class object vie Literal
class StringClassObjectViaLiteral {
	public static void main(String[] om) {
		String p1 = "headstrong";
		String p2 = "headstrong";
		if (p1 == p2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("headstrong".length());
	}
}
/*
 * Output true 10
 */