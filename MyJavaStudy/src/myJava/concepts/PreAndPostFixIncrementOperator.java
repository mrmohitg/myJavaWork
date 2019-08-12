package myJava.concepts;

//Finding the difference between pre and post increment of x.
public class PreAndPostFixIncrementOperator {
	public static void main(String args[]) {
		int a = 1, b = 2;
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		a = ++b;
		System.out.println("After a=++b statement.");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		int c = 1, d = 2;
		System.out.println("Value of c is " + c);
		System.out.println("Value of d is " + d);
		c = d++;
		System.out.println("After c=d++ statement.");
		System.out.println("Value of c is " + c);
		System.out.println("Value of d is " + d);
		int z = 7, result;
		result = ++z * z++;
		System.out.println("The result of ++z*z++ where z=7 is " + result
				+ " because ++z has increased the value of z and now instead of 7*7 8*8 will perform.");
	}
}
/*
 * Output Value of a is 1 Value of b is 2 After a=++b statement. Value of a is 3
 * Value of b is 3 Value of c is 1 Value of d is 2 After c=d++ statement. Value
 * of c is 2 Value of d is 3 The result of ++z*z++ where z=7 is 64 because ++z
 * has increased the value of z and now instead of 7*7 8*8 will perform.
 */