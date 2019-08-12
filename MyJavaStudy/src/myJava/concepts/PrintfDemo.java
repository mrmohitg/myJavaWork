package myJava.concepts;

//printf function also work in Java that is a proof that Java has inherited its complete syntax from C. 
public class PrintfDemo {
	public static void main(String args[]) {
		String s1 = "Hello";
		int n = 65;
		float f = 18.888f;
		System.out.printf("String = %s %nNumber = %d %nHexa Decimal = %x %nFloat = %f", s1, n, n, f);
	}
}
/*
 * Output String = Hello Number = 65 Hexa Decimal = 41 Float = 18.888000
 */