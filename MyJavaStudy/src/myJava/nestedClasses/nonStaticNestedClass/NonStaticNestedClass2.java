package myJava.nestedClasses.nonStaticNestedClass;

//Non static nested class is accessing non static nested method 
class NonStaticNestedClass2 {
	int x = 10;
	static int y = 20;

	class Inner {
		int x = 30;

		void show() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(NonStaticNestedClass2.this.x);
		}
	}

	public static void main(String... s) {
		NonStaticNestedClass2 obj = new NonStaticNestedClass2();
		System.out.println(obj.x);
		System.out.println(y);
		obj.new Inner().show();
	}
}
/*
 * Output 10 20 30 20 10
 */