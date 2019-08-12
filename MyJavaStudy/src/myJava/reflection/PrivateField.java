package myJava.reflection;

import java.lang.reflect.Field;

public class PrivateField {
	public static void main(String... args) throws Exception {
		Class<TestField> c = TestField.class;
		TestField tf = new TestField();
		Field field = c.getDeclaredField("x");
		field.setAccessible(true);
		System.out.println(field);
		System.out.println(field.get(tf));
		field.set(tf, 30);
		System.out.println(field.get(tf));
	}
}

class TestField {
	private int x = 10;
}
