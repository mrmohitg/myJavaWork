package myJava.threading.viaInheritance;

class Thread01 extends Thread {
	Thread01(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(this.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class MyRun {
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("T1");
		Thread01 t2 = new Thread01("T2");
		Thread01 t3 = new Thread01("T3");
		Thread01 t4 = new Thread01("T4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(Thread.currentThread().getName());
	}
}