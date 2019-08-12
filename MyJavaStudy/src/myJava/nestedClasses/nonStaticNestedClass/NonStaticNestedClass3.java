package myJava.nestedClasses.nonStaticNestedClass;

//Non static nested class' Outer class is inherited by the Main class.
class Outerr {
	int x = 10;
	static int y = 20;

	class Inner {
		void show() {
			System.out.println(x);
			System.out.println(y);
		}
	}
}

class NonStaticNestedClass3 extends Outerr {
	public static void main(String... s) {
		NonStaticNestedClass3 obj = new NonStaticNestedClass3();
		System.out.println(obj.x);
		System.out.println(y);
		NonStaticNestedClass3.Inner obj2 = obj.new Inner();
		obj2.show();
	}
}
/*
 * Output 10 20 10 20
 */