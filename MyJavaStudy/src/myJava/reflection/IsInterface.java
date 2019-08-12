package myJava.reflection;

public class IsInterface {
	public static void main(String... args) throws Exception {
		Class c = String.class;
		boolean isInterface = c.isInterface();
		System.out.println(c.getClass().getName() + " is Interface : " + isInterface);
	}
}