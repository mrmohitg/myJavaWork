package myJava.strings;

//This program converts an String into char type array with the help of toCharArray method
class ConvertStringIntoCharArray {
	public static void main(String... p) {
		char ch[] = "mohit".toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String>java
 * ConvertStringIntoCharArray m o h i t
 */
