package myJava.concepts;

//Private Data Member can be accessed by using the public or default access specifiers.
class SecondClass {
	private String name = "MOHIT";

	void show() {
		System.out.println(name);
	}
}

class ClassAndObject {
	public static void main(String... s) {
		SecondClass obj = new SecondClass();
		obj.show();
	}
}
/*
 * Output MOHIT
 */