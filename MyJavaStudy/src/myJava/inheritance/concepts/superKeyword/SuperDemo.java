package myJava.inheritance.concepts.superKeyword;

//'super()' is used to call parent class constructor before executing any constructor it parent class constructor executes first.
class Supar1 {
	Supar1() {
		super();
		System.out.println("A");
	}
}

class Supar extends Supar1 {
	Supar() {
		super();
		System.out.println("B");
	}
}

class SuperDemo extends Supar {
	SuperDemo() {
		super();
		System.out.println("C");
	}

	public static void main(String... s) {
		new SuperDemo();
	}
}
/*
 * Output A B C
 */