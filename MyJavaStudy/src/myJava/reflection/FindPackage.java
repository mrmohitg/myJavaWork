package myJava.reflection;

class FindPackage {
	public static void printPackage(Object o) {
		Class<? extends Object> c = o.getClass();
		Package p = c.getPackage();
		System.out.println(p.getName());
	}

	public static void main(String... args) {
		String s = new String("Mohit");
		printPackage(s);
	}
}