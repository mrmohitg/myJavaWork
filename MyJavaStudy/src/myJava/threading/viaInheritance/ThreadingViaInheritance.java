package myJava.threading.viaInheritance;

class Thread11 extends Thread {
	Thread11(String s) {
		super(s);
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(this.currentThread().getName());
				Thread.sleep(1000);
			}
			System.out.println(getName() + " is dead.");
		} catch (Exception e) {
		}

	}
}

class Thread22 extends Thread {
	Thread22(String s) {
		super(s);
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.currentThread().getName());
				Thread.sleep(1000);
			}
			System.out.println(getName() + " is dead.");
		} catch (Exception e) {
		}
	}
}

class Thread33 extends Thread {
	Thread33(String s) {
		super(s);
	}

	public void run() {
		try {
			for (int i = 0; i < 15; i++) {
				System.out.println(this.currentThread().getName());
				Thread.sleep(1000);
			}
			System.out.println(getName() + " is dead.");
		} catch (Exception e) {
		}
	}
}

class ThreadingViaInheritance {
	public static void main(String args[]) {
		Thread11 t1 = new Thread11("Thread 1");
		Thread22 t2 = new Thread22("Thread 2");
		Thread33 t3 = new Thread33("Thread 3");
		t1.start();
		t2.start();
		t3.start();
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			System.out.println(Thread.currentThread().getName() + " is dead.");
		} catch (Exception e) {
		}
	}
}