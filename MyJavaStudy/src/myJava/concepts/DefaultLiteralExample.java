package myJava.concepts;

//Using literals
class DefaultLiteralExample {
	public static void main(String... s) {
		DefaultLiteralExample obj = new DefaultLiteralExample();
		obj.show(10);
		obj.show(12l);
		obj.show(2.33);
		obj.show(3.3f);
	}

	void show(byte b) {
		System.out.println("Byte show function " + b);
	}

	void show(short s) {
		System.out.println("Short show function " + s);
	}

	void show(int i) {
		System.out.println("Int show function " + i);
	}

	void show(long l) {
		System.out.println("Long show function " + l);
	}

	void show(float f) {
		System.out.println("Float show function " + f);
	}

	void show(double d) {
		System.out.println("Double show function " + d);
	}
}
/*
 * Output Int show function 10 Long show function 12 Double show function 2.33
 * Float show function 3.3
 */