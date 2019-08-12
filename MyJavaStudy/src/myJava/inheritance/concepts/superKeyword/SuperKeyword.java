package myJava.inheritance.concepts.superKeyword;

//SuperKeyword at work
class Superaccess {
	int x, y;

	Superaccess(int a, int b) {
		x = a;
		y = b;
	}

	void Show() {
		System.out.println(x + y);
	}
}

class SuperKeyword extends Superaccess {
	SuperKeyword(int a, int b, int c) {
		super(a, b);
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String... s) {
		SuperKeyword obj = new SuperKeyword(10, 20, 30);
		obj.Show();
	}
}
/*
 * Output 10 20 30 30
 */
