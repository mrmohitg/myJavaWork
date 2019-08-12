package myJava.wrapperClasses;

class WrapperDemo {
	public static void main(String... args) {
		Character c = new Character('a');
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		String s = String.valueOf(c);
		System.out.println(s);
		s = String.valueOf(i);
		System.out.println(s);
		s = String.valueOf(i1);
		System.out.println(s);
	}
}