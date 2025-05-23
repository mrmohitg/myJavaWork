package myJava.constructor;

//Default Constructor is always executed
class Demo {
	Demo() {
		System.out.println("This is Demo class's Default Constructor.");
	}
}

class DefaultConstructor extends Demo {
	DefaultConstructor() {
		System.out.println("This is DefaultConstructor class's Default Constructor.");
	}

	public static void main(String... s) {
		new DefaultConstructor();
	}
}
/*
 * Output This is Demo class's Default Constructor. This is DefaultConstructor
 * class's Default Constructor.
 */