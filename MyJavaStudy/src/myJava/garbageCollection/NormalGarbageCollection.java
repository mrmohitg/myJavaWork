package myJava.garbageCollection;

//This is example of Garbage Collection by normal disposal of reference variable.
class Demoo {
	int x = 10, y = 20;

	protected void finalize() throws Throwable {
		System.out.println("Object is dead.");
	}

	static void show() {
		Demoo d1 = new Demoo();
	}

	static void display() {
		Demoo d2 = new Demoo();
		show();
	}
}

class NormalGarbageCollection {
	public static void main(String... s) throws Exception {
		Demoo.display();
		System.gc();
	}
}
/*
 * Output Object is dead.
 */