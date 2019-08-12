package myJava.threading.synchronization.deadLock;

class Shared {
	int x;

	synchronized void show(String s, int a) {
		x = a;
		System.out.println("Starting in method " + s + " " + x);
		Thread.currentThread().suspend();
		Thread.currentThread().resume();
		System.out.println("Exit from method " + s + " " + x);
	}
}