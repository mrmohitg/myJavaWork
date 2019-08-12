package myJava.reflection;

import java.awt.Frame;

public class FindSuperClass {
	public static void printSuperClass(Object o) {
		Class<?> subClass = o.getClass();
		Class<?> superClass = subClass.getSuperclass();
		while (superClass != null) {
			System.out.println(superClass.getName());
			subClass = superClass;
			superClass = subClass.getSuperclass();
		}
	}

	public static void main(String... args) {
		Frame f = new Frame("Parent Classes");
		printSuperClass(f);
	}
}