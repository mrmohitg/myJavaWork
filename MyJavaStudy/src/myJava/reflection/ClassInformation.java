package myJava.reflection;

public class ClassInformation {
	public static void main(String... args) {
		ClassInformation t = new ClassInformation();
		Class<? extends ClassInformation> c = t.getClass();
		System.out.println(c.getName());
		Class<Thread> c1 = Thread.class;
		System.out.println(c1.getName());
	}
}