package myJava.concepts;

//Using bitwise operator
public class BitwiseOperator {
	public static void main(String args[]) {
		byte x, y;
		x = 10;
		y = 11;
		System.out.println("~x = " + (~x));
		System.out.println("x & y = " + (x & y));
		System.out.println("x | y = " + (x | y));
		System.out.println("x ^ y = " + (x ^ y));
		System.out.println("x << 2 = " + (x << 2));
		System.out.println("x >> 2 = " + (x >> 2));
		System.out.println("x >>> 2 = " + (x >>> 2));
	}
}
/*
 * Output ~x = -11 x & y = 10 x | y = 11 x ^ y = 1 x << 2 = 40 x >> 2 = 2 x >>>
 * 2 = 2
 */