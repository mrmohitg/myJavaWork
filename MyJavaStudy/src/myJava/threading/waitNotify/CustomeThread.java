package myJava.threading.waitNotify;

class CustomeThread extends Thread {
	Shared s;

	public CustomeThread(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		System.out.println("In withdraw method.");
		s.withdraw();
		System.out.println("Exiting withdraw method");
	}
}

class CustomeThread1 extends Thread {
	Shared s;

	public CustomeThread1(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		System.out.println("In submit method");
		s.submit();
		System.out.println("Exit submit method");
	}
}
