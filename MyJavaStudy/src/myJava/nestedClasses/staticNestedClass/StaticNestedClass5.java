package myJava.nestedClasses.staticNestedClass;

//Static Nested Class is extending the main class
class StaticNestedClass5 {
	int x = 10;
	static int y = 20;

	static class In extends StaticNestedClass5 {
		static void show() {
			// System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String... s) {
		StaticNestedClass5.In v = new StaticNestedClass5.In();
		System.out.println("By Qualifying with the name of the class");
		StaticNestedClass5.In.show();
		System.out.println("By Directly calling the static variable in the static function by qualifying with the name "
				+ StaticNestedClass5.y);
		In obj = new In();
		System.out.println("By Calling static function with the help of an object.");
		obj.show();
	}
}
/*
 * Output By Qualifying with the name of the class 20 By Directly calling the
 * static variable in the static function by qualifying wit h the name 20 By
 * Calling static function with the help of an object. 20
 */