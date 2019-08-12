package myJava.wrapperClasses;

class Pool {
	public static void main(String... args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		boolean b = i1 == i2;
		System.out.println(b);
		i1 = 20;
		i2 = 20;
		b = i1 == i2;
		System.out.println(b);
	}
}