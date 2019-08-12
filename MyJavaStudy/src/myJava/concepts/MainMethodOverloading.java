package myJava.concepts;

//Main method overloading 
class MainMethodOverloading {
	public static void main(String s2) {
		System.out.println(s2);
	}

	public static void main(String s[]) {
		System.out.println("First Main To Execute.");
		main("Second Main To Execute.");
		char c[] = { 'M', 'A', 'I', 'N' };
		main(c);
	}

	public static void main(char c1[]) {
		System.out.println(c1);
	}
}
/*
 * Output First Main To Execute. Second Main To Execute. MAIN
 */