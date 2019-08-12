package myJava.reflection;

import java.lang.reflect.Constructor;

public class PrivateConstructor {
	public static void main(String... args) throws Exception {
		try {
			Class<Temp1> c = Temp1.class;
			Constructor<Temp1> cons = c.getDeclaredConstructor();
			cons.setAccessible(true);
			Temp1 t = (Temp1) cons.newInstance();
			t.show();
			Constructor<Temp1> cons1 = Temp1.class.getDeclaredConstructor(int.class);
			cons1.setAccessible(true);
			Temp1 t1 = (Temp1) cons1.newInstance(10);
			t1.show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Temp1 {
	private Temp1() {
		System.out.println("Default Constructor");
	}

	private Temp1(int x) {
		System.out.println("Parametrized Constructor : " + x);
	}

	void show() {
		System.out.println("Accessing private constructors via reflection.");
	}
}
