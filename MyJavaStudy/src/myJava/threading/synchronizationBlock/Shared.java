package myJava.threading.synchronizationBlock;

class Shared {
	int x;

	void show(String s, int a) {
		System.out.println("Starting in method" + s);
		synchronized (this) {
			x = a;
			System.out.println("Starting in method " + s + " " + x);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println("Exit from method " + s + " " + x);
		}
	}
}