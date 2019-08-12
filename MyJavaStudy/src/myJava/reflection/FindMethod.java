package myJava.reflection;

import java.lang.reflect.Method;

class FindMethod {
	public static void printMethod(Object o) {
		Class<? extends Object> c = o.getClass();
		Method method[] = c.getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.print(method[i].getReturnType().getName());
			System.out.print(" " + method[i].getName());
			System.out.print("(");
			Class<?> type[] = method[i].getParameterTypes();
			for (int j = 0; j < type.length; j++) {
				System.out.print(type[j].getName() + ",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}

	public static void main(String... args) {
		String s = new String("Mohit");
		printMethod(s);
	}
}