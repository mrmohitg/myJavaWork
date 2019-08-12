package myJava.nestedClasses.staticNestedClass;

//Class which is having Static nested class inherited by Main Class 
class Outerr {
	int x = 10;
	static int y = 20;

	static class Inner {
		static void show() {
			// System.out.println(x);
			System.out.println(y);
		}
	}
}

class StaticNestedClass3 extends Outerr {
	public static void main(String... s) {
		Outerr.Inner obj = new Outerr.Inner();
		obj.show();
		Inner.show();
	}
}
/*
 * Output 20 20
 */