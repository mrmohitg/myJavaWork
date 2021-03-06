package myJava.concepts;

//Printing the ReferenceId will get us ClassName@HashCode's HexaDecimal representation.
class PrintingReferenceID {
	int radius;

	void areaOfCircle(int r) {
		radius = r;
		float result = (float) (3.14 * r * r);
		System.out.println("The area of circle whose radius is " + radius + " = " + result);
	}

	public static void main(String... a) {
		PrintingReferenceID obj = new PrintingReferenceID();
		System.out.println(obj);
		obj.areaOfCircle(4);
	}
}
/*
 * Output PrintingReferenceID@2a139a55 The area of circle whose radius is 4 =
 * 50.24
 */