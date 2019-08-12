package myJava.reflection;

public class FindInterface {
	public static void printInterface(Object o) {
		Class<? extends Object> c = o.getClass();
		Class<?> inter[] = c.getInterfaces();
		for (int i = 0; i < inter.length; i++) {
			System.out.println(inter[i].getName());
		}
	}

	public static void main(String... args) {
		Test t = new Test();
		printInterface(t);
	}
}

class Test implements interface1, interface2, interface3 {
}

interface interface1 {
}

interface interface2 {
}

interface interface3 {
}