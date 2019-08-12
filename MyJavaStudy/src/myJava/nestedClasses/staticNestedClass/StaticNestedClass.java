package myJava.nestedClasses.staticNestedClass;

//Static nested class having non static method and psvm inside nested class
class StaticNestedClass {
	int x = 10;
	static int y = 20;

	static class Inner {
		void show() {
			StaticNestedClass o = new StaticNestedClass();
			System.out.println(o.x);
			System.out.println(y);
		}

		public static void main(String args[]) {
			System.out.println("You can keep main method in static nested classes.");
		}
	}

	public static void main(String... s) {
		Inner obj = new Inner();
		obj.show();
	}
}
/*
 * Output 10 20
 */