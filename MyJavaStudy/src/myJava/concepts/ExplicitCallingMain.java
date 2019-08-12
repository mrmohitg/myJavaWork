package myJava.concepts;

// Explicit calling of main function of Test class in the ExplicitCallingMain class.  
class Testtt {
	public static void main(String... a) {
		System.out.println("Hello Test");
	}
}

public class ExplicitCallingMain {
	public static void main(String args[]) {
		System.out.println("Hello ExplicitCallingMain");
		Testtt.main();
		Testtt.main("ABC");
		Testtt.main("ABC", "XYZ");
	}
}
/*
 * Output Hello ExplicitCallingMain Hello Test Hello Test Hello Test
 */