package myJava.nestedClasses.nonStaticNestedClass;

//Non static nested class is acessing non static method.
class NonStaticNestedClass {
	int x = 10;
	static int y = 20;

	class Inner {
		void show() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String... s) {
		NonStaticNestedClass obj = new NonStaticNestedClass();
		System.out.println(obj.x);
		System.out.println(y);
		NonStaticNestedClass.Inner i = obj.new Inner();
		i.show();
	}
}
/*
 * Output 10 20 10 20
 */