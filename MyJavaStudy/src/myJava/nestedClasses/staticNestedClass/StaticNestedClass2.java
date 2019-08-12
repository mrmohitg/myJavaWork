package myJava.nestedClasses.staticNestedClass;

//Static Nested Class having non static method using non static data member and static data member of the Outer class
class Outer {
	int x = 10;
	static int y = 20;

	static class Inner {
		void show() {

			// System.out.println(x);
			System.out.println(y);
		}
	}
}

class StaticNestedClass2 {
	public static void main(String... s) {
		Outer.Inner obj = new Outer.Inner();
		obj.show();
	}
}
/*
 * Output 20
 */