package myJava.annotation;

class Base {
	void show(int x[]) {
		System.out.println("overriden method in Base class.");
	}
}

class Child extends Base {
	@Override
	void show(int z[]) {
		System.out.println("overriden method in Child class.");
	}
}

public class OverrideAnnotation {
	public static void main(String... args) {
		int abc[] = { 1, 2, 3, 4, 5, 6 };
		new Child().show(abc);
	}
}