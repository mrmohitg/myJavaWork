package myJava.concepts;

//Using static variabless.
class Test {
	static int x = 100;

	static void display() {
		System.out.println(x);
	}
}

public class UsingStaticVariables {
	public static void main(String args[]) {
		Test obj1, obj2;
		obj1 = new Test();
		++obj1.x;
		System.out.println("x in obj1 : ");
		obj1.display();
		obj2 = new Test();
		System.out.println("x in obj2 : ");
		obj2.display();
		;
	}
}
/*
 * Output x in obj1 : 101 x in obj2 : 101
 */