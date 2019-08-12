package myJava.threading.synchronization;

class MyShared {
	public static synchronized void display(int i) {
		try {
			System.out.println("This is static Synchronization Method started.");
			for (; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("This is static Synchronization Method ended.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Thread1 extends Thread {
	public void run() {
		MyShared.display(1);
	}
}

class Thread2 extends Thread {
	public void run() {
		MyShared.display(-10);
	}
}

public class StaticSynchronization {
	public static void main(String args[]) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}