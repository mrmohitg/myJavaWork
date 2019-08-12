package myJava.threading;

class Thrread extends Thread {
	Thrread(String s) {
		super(s);
	}

	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000000);
		} catch (Exception e) {
			System.out.println(e + "- Interrupted Forcefully");
		}
		System.out.println(getName() + " Dead");
	}
}

class Thrrread extends Thread {
	Thrread t;

	Thrrread(String s, Thrread t) {
		super(s);
		this.t = t;
	}

	public void run() {
		System.out.println(getName());
		t.interrupt();
		System.out.println("isInterrupted() is called on Tread1 and result is: " + t.isInterrupted());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println(getName() + " Dead");
	}
}

class InterrupteMethod {
	public static void main(String args[]) {
		Thrread tt = new Thrread("Thread 1");
		tt.setPriority(10);
		Thrrread ttt = new Thrrread("Thread 2", tt);
		tt.start();
		ttt.start();
	}
}