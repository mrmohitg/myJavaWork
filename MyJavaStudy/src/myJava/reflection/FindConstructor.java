package myJava.reflection;

import java.lang.reflect.Constructor;

public class FindConstructor {
	public static void printConstructor(Object o) {
		Class<? extends Object> c = o.getClass();
		Constructor<?> cons[] = c.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i].getName() + "(");
			Class<?> type[] = cons[i].getParameterTypes();
			for (int j = 0; j < type.length; j++) {
				System.out.print(type[j].getName() + ",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}

	public static void main(String... args) {
		Thread t = new Thread("Thread");
		// String s = new String("Mohit");
		printConstructor(t);
		// printConstructor(s)
	}
}