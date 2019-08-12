package myJava.reflection;

import java.lang.reflect.Modifier;

class FindModifier {
	public static void printModifier(Object o) throws ClassNotFoundException {
		Class<? extends Object> c = o.getClass();
		//Class<?> c = Class.forName("java.awt.Graphics");
		int modifier = c.getModifiers();
		if (Modifier.isPublic(modifier))
			System.out.println("Public");
		if (Modifier.isFinal(modifier))
			System.out.println("Final");
		if (Modifier.isAbstract(modifier))
			System.out.println("Abstract");
	}

	public static void main(String... args) {
		String a = new String("Mohit");
		try {
			printModifier(a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}