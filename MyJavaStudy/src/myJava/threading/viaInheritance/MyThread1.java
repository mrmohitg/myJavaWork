package myJava.threading.viaInheritance;

class Thread1 extends Thread {
	Thread1(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(this.currentThread().getName());
		}
		System.out.println("Thread1 Dead:" + Thread.currentThread().getName());

	}
}

class Thread2 extends Thread {
	Thread2(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(this.currentThread().getName());
		}
		System.out.println("Thread2 Dead:" + Thread.currentThread().getName());

	}
}

class Thread3 extends Thread {
	Thread3(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(this.currentThread().getName());
		}
		System.out.println("Thread3 Dead:" + Thread.currentThread().getName());

	}
}

class Thread4 extends Thread {
	Thread4(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(this.currentThread().getName());
		}
		System.out.println("Thread4 Dead:" + Thread.currentThread().getName());

	}
}

public class MyThread1{
	public static void main(String[] ali) {
		Thread1 t1 = new Thread1("T1");
		Thread2 t2 = new Thread2("T2");
		Thread3 t3 = new Thread3("T3");
		Thread4 t4 = new Thread4("T4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Main Thread Dead:" + Thread.currentThread().getName());
	}
}