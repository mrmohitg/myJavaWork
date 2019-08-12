package myJava.nestedClasses.annonymousClass;

//Anonymous Class is at full flow
interface Mmy {
	public void show();
}

public class MyAnnonymous implements Mmy {
	static int x = 20;

	public Mmy display() {
		return (new MyAnnonymous() {
		});
	}

	public void show() {
		System.out.println("Method of interface is starting..............");
	}

	public static void main(String[] args) {
		MyAnnonymous v = new MyAnnonymous();
		Mmy z = v.display();
		z.show();
	}
}
/*
 * Output Method of interface is starting..............
 */
