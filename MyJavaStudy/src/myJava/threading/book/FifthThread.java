package myJava.threading.book;

//Thread Unsafe Two Thread acting on same object.
class FiftThread implements Runnable {
	int available = 1;
	int wanted;

	FiftThread(int i) {
		wanted = i;
	}

	public void run() {
		System.out.println("Available Berth " + available);
		if (available >= wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted + " Berths reserved for " + name);
			try {
				Thread.sleep(1500);
				available = available - wanted;
			} catch (Exception e) {
			}
		} else
			System.out.println("Sorry No birth available.");
	}
}

class FifthThread {
	public static void main(String... s) {
		FiftThread obj = new FiftThread(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("First Person");
		t2.setName("Second Person");
		t1.start();
		t2.start();
	}
}