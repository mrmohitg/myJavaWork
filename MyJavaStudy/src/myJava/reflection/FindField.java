package myJava.reflection;

import java.awt.Color;
import java.lang.reflect.Field;


class FindField {
	public static void printField(Object o) {
		Class<? extends Object> c = o.getClass();
		Field field[] = c.getFields();
		for (int i = 0; i < field.length; i++) {
			Class<?> type = field[i].getType();
			System.out.print(type.getName());
			System.out.print(" " + field[i].getName());
			System.out.println("");
		}
	}

	public static void main(String... args) {
		Color c = new Color(1, 1, 1);
		printField(c);
	}
}