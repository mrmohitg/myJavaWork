package myJava.strings;

//This program shows the concatination via + operator
class ConcatinationViaPlusOperator {
	public static void main(String[] agrs) {
		String s1 = 10 + 20 + 40 + "hey" + 100 + 100 + "hello" + 1000 + 1000;
		String s2 = s1 + "agla bhai";
		System.out.println(s2);
		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int x = 10;// via data type or auto boxing
		System.out.print("This is the representation of Data Type version of variable.");
		System.out.println(x);
		Integer i = new Integer(10);// via wrapper class
		System.out.print("This is the wrapper representation of the variable.");
		System.out.println(i);
	}
}
/*
 * Output D:\Work\Java\Code\40StringHandling\1String>java
 * ConcatinationViaPlusOperator 70hey100100hello10001000agla bhai false This is
 * the representation of Data Type version of variable.10 This is the wrapper
 * representation of the variable.10
 */