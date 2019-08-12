package myJava.strings;

//This program shows string class object via new keyword and getting reference of string class object made in string constant pool with the intern method.
class StringClassObjectViaConstructor {
	public static void main(String[] om) {
		String h = new String("Hello"); // to make object in heap and pool via constructor.
		String p = "Hello"; // to make object in pool via literal.
		String h1 = h.intern(); // this intern method will bring the reference of the String Class object which
								// have been created in the string constant pool instead of heap.
		if (p == h1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
/*
 * Output true
 */