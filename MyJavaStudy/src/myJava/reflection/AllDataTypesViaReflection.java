package myJava.reflection;

class AllDataTypesViaReflection {
	public static void main(String... args) {
		Class<Void> c1 = void.class;
		System.out.println(c1.getName());
		Class<Byte> c2 = byte.class;
		System.out.println(c2.getName());
		Class<Short> c3 = short.class;
		System.out.println(c3.getName());
		Class<Integer> c4 = int.class;
		System.out.println(c4.getName());
		Class<Long> c5 = long.class;
		System.out.println(c5.getName());
		Class<Float> c6 = float.class;
		System.out.println(c6.getName());
		Class<Double> c7 = double.class;
		System.out.println(c7.getName());
		Class<Character> c8 = char.class;
		System.out.println(c8.getName());
		Class<String> c9 = String.class;
		System.out.println(c9.getName());
	}
}