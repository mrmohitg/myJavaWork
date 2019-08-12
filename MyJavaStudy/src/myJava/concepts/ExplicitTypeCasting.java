package myJava.concepts;

//Explicit Type Casting is working which is done by the user.
class ExplicitTypeCasting {
	public static void main(String... s) {
		byte a = 10;
		byte b = 20;
		// byte c=a+b; //Compile Time Error Because a+b will be treated as an literal
		// and an integer literal will be of int type by default.
		byte c = (byte) (a + b);
		System.out.println(c);
	}
}
/*
 * Output 30
 */