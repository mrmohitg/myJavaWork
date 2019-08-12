package myJava.threading.viaAssociation;

class Threadd implements Runnable {
	int x = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + x);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class ThreadingViaAssociation {
	public static void main(String... s) {
		Threadd t1 = new Threadd();
		t1.x = 100;
		Thread tt1 = new Thread(t1, "First Thread");
		tt1.start();
		Threadd t2 = new Threadd();
		t2.x = 200;
		Thread tt2 = new Thread(t2, "Second Thread");
		tt2.start();
		Threadd t3 = new Threadd();
		t3.x = 300;
		Thread tt3 = new Thread(t3, "Third Thread");
		tt3.start();
	}
}