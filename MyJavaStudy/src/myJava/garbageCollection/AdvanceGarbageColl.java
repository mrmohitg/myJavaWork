package myJava.garbageCollection;

//Garbage Collection 
class MyClass1 {
	int x = 10, y = 20;

	protected void finalize() throws Throwable {
		System.out.println("gc chal gaya bhai");
	}

	static void f1() {
		MyClass1 m1 = new MyClass1();
		System.out.println("f2 bhai");
		m1.f3();
	}

	static void f2() {
		MyClass1 m2 = new MyClass1();
		System.out.println("f1 bhai");
		f1();

	}

	void f3() {
		System.out.println("f3 bhai");
	}
}

public class AdvanceGarbageColl {
	public static void main(String[] args) throws Exception {
		MyClass1.f2();
		try {
			for (int i = 0; i < 1; i++) {
				Thread.sleep(1000);
				System.gc();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		/*
		 * for(int i=0;i<1000;i++) { new MyClass1(); }
		 */
	}
}

/*
 * Output f1 bhai f2 bhai f3 bhai gc chal gaya bhai gc chal gaya bhai
 */