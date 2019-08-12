package myJava.annotation;

class TestDeprecated {
	@Deprecated
	static void display() {
		System.out.println("Display");
	}
}

public class DeprecatedAnnotation {
	public static void main(String... args) {
		new DeprecatedAnnotation().doSomeTestNow();
	}

	public void doSomeTestNow() {
		TestDeprecated.display();
	}
}
