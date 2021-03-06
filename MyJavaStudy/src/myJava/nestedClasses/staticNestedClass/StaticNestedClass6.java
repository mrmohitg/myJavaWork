package myJava.nestedClasses.staticNestedClass;

//Static Nested Class inside it we are using non static method.
class StaticNestedClass6 {
	int x = 10;
	static int y = 20;

	static class Inner {
		void show(StaticNestedClass6 a) {
			System.out.println(a.x);
			System.out.println(y);
		}

		static void main() {
			System.out.println("main method" + y);
		}
	}

	public static void main(String... s) {
		Inner obj = new Inner();
		StaticNestedClass6 ooo = new StaticNestedClass6();
		obj.show(ooo);
		Inner.main();
	}
}
/*
 * Output 10 20 main method20
 */
