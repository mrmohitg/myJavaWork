package myJava.reflection;

public class AllArray {
	public static void main(String... args) {
		String name = boolean[].class.getName();
		System.out.println(name);
		name = byte[].class.getName();
		System.out.println(name);
		name = short[].class.getName();
		System.out.println(name);
		name = int[].class.getName();
		System.out.println(name);
		name = long[].class.getName();
		System.out.println(name);
		name = float[].class.getName();
		System.out.println(name);
		name = double[].class.getName();
		System.out.println(name);
		name = char[].class.getName();
		System.out.println(name);
		name = String[].class.getName();
		System.out.println(name);
	}
}