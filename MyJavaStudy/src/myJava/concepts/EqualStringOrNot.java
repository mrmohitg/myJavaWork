package myJava.concepts;

//Comparing object of String class i.e. literal and new operator with '==' and 'equals()'
class EqualStringOrNot {
	public static void main(String ar[]) {
		String variable1 = "Hello!";
		String variable2 = new String("Hello!");
		System.out.println(variable1.equals(variable2));
		System.out.println(variable1);
		System.out.println(variable2);
		if (variable1 == variable2)
			System.out.println("They both are equal string.");
		else
			System.out.println("They both are different string.");
		if (variable1.equals(variable2))
			System.out.println("They both are equal string.");
		else
			System.out.println("They both are different string.");
	}
}
/*
 * Output true Hello! Hello! They both are different string. They both are equal
 * string.
 */
