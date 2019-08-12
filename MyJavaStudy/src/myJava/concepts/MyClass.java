package myJava.concepts;

//Providing value to the class level variable via 'this' keyword
public class MyClass {
	int x, y;

	MyClass(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.x * this.y);
	}

	void show() {
		final int a = 12;
		System.out.println(a);
	}

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(100, 200);
		obj1.show();
	}
}
/*
 * Output 100 200 20000 12
 */
