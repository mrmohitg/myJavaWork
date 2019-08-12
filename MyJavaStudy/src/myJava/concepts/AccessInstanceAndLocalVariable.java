package myJava.concepts;

//Access Instance variable and local variable from a method
class Testt {
	private int x;

	void modify(int a) {
		x = a;
	}

	void access() {
		System.out.println("x=" + x);
		// System.out.println("a="+a);
	}
}

public class AccessInstanceAndLocalVariable {
	public static void main(String args[]) {
		Testt obj = new Testt();
		obj.modify(10);
		obj.access();
	}
}
/*
 * Output x=10
 */