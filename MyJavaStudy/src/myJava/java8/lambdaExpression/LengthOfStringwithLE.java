package myJava.java8.lambdaExpression;

interface Interf2 {
	public int m2(String s);
}

public class LengthOfStringwithLE {

	public static void main(String[] args) {
		Interf2 i = (String a) -> a.length();
		int length = i.m2("Mohit Gupta");
		System.out.println(length);
	}

}
