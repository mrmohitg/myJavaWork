package myJava.threading;

public class RunThread {
	public static void main(String a[]) {
		Shared s = new Shared();
		Thread15 t1 = new Thread15(s);
		Thread25 t2 = new Thread25(s);
		Thread t11 = new Thread(t1, "T1");
		Thread t22 = new Thread(t2, "T2");
		t11.start();
		t22.start();
	}
}

class Thread15 implements Runnable {
	Shared s;

	Thread15(Shared s) {
		this.s = s;
	}

	public void run() {
		s.withdraw(Thread.currentThread().getName(), 10);
	}
}

class Thread25 implements Runnable {
	Shared s;

	Thread25(Shared s) {
		this.s = s;
	}

	public void run() {
		s.submit(Thread.currentThread().getName(), 20);
	}
}

class Shared {
	int a;
	int flag = 0;

	synchronized void submit(String sr, int x) {
		a = x;
		System.out.println("Entry:" + " " + sr + " " + a);
		try {
			Thread.sleep(2000);
			System.out.println(sr + " " + "is under show submit");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Exit:" + " " + sr + " " + a);
		notify();
	}

	synchronized void withdraw(String sr, int x) {
		a = x;
		System.out.println("Entry:" + " " + sr + " " + a);
		try {
			Thread.sleep(2000);
			System.out.println(sr + " " + "is under show withdraw");
			wait();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Exit:" + " " + sr + " " + a);
	}
}
