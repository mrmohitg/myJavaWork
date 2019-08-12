package myJava.concepts;

//Type Promotion is the process in which first int function is called and if not available then long method will be called.
class TypePramotion {
	void show(byte a) {
		System.out.println(a);
		System.out.println("byte wala");
	}

	void show(short a) {
		System.out.println(a);
		System.out.println("short wala");
	}

	/*
	 * void show(int a) { System.out.println(a); System.out.println("int wala"); }
	 */
	void show(long a) {
		System.out.println(a);
		System.out.println("long wala");
	}

	public static void main(String[] args) {
		TypePramotion obj = new TypePramotion();
		obj.show(2);// By Default any numeric literal is treated as int
		byte i = 2;
		obj.show(i);
	}
}
/*
 * Output 2 long wala 2 byte wala
 */