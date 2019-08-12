package myJava.nestedClasses.staticNestedClass;

//Static Nested Class inherited by Main Class explicitly
class Outerrr {
	int x = 10;
	static int y = 20;

	static class Inner {
		void show() {
			// System.out.println(x);
			System.out.println(y);
		}
	}
}

class StaticNestedClass4 extends Outer.Inner {
	public static void main(String... s) {
		Outerrr.Inner obj = new Outerrr.Inner();
		obj.show();
		StaticNestedClass4 obj1 = new StaticNestedClass4();
		obj1.show();
	}
}
/*
 * Output 20 20
 */