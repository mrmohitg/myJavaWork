package myJava.wrapperClasses;

class EqualsMethod {
	public static void main(String... args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		boolean b = i1.equals(i2);
		System.out.println(b);
		Character c1 = new Character('a');
		Character c2 = new Character('a');
		b = c1.equals(c2);
		System.out.println(b);
	}
}