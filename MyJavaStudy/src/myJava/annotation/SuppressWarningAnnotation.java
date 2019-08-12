package myJava.annotation;


class Test {
	@Deprecated
	static void display() {
		System.out.println("Display");
	}
}

public class SuppressWarningAnnotation {
	public static void main(String... args) {
		new SuppressWarningAnnotation().doSomeTestNow();
	}

	@SuppressWarnings({ })
	public void doSomeTestNow() {
		Test.display();
	}
}
