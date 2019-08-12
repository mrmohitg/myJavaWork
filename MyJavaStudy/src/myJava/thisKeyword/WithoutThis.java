package myJava.thisKeyword;

//How 'this' keyword works
class WithoutThis {
	int x = 20;

	void show(int x, WithoutThis y) {
		System.out.println("This is local value of x = " + x);
		System.out.println("This is class level value of x = " + y.x);
	}

	public static void main(String... s) {
		WithoutThis obj = new WithoutThis();
		obj.show(10, obj);
	}
}
/*
 * Output This is local value of x = 10 This is class level value of x = 20
 */