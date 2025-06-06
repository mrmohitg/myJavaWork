package myJava.threading.book;

//Single tasking using a thread
class ThirThread implements Runnable {
	public void run() {
		task1();
		task2();
		task3();
	}

	void task1() {
		System.out.println("This is task 1");
	}

	void task2() {
		System.out.println("This is task 2");
	}

	void task3() {
		System.out.println("This is task 3");
	}
}

class ThirdThread {
	public static void main(String... args) {
		ThirThread obj = new ThirThread();
		Thread t = new Thread(obj);
		t.start();
	}
}