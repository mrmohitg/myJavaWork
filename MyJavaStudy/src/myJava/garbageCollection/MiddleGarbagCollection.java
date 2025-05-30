package myJava.garbageCollection;

//Systematic deletion of local reference variables which is holding reference of an object Garbage Collection 
class Demo {
	int x = 10, y = 20;

	protected void finalize() throws Throwable {
		System.out.println("Dead Object is Cleaned by JVM.");
	}

	static void show() {
		Demo d1 = new Demo();
	}

	static void display() {
		Demo d2 = new Demo();
		show();
	}
}

class MiddleGarbagCollection {
	public static void main(String... s) throws Exception {
		Demo.display();
		for (int i = 1; i <= 1000; i++) {
			System.gc();
		}
	}
}
/*
 * Output Dead Object is Cleaned by JVM. Dead Object is Cleaned by JVM.
 */