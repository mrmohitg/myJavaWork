package myJava.nestedClasses.nonStaticNestedClass;

//Non static nested class accessing the non static method of the class.
class Outer {
	int outer_x = 200;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	class Inner {
		void display() {
			System.out.println(outer_x);
		}
	}
}

class InnerDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}
/*
 * Output 200
 */
