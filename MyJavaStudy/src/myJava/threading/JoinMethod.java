package myJava.threading;

class JoinDemo implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println(Thread.currentThread().getName() + " " + "dead.");
	}
}

class JoinMethod {
	public static void main(String... s) {
		JoinDemo ft1 = new JoinDemo();
		Thread tt1 = new Thread(ft1, "One");
		JoinDemo ft2 = new JoinDemo();
		Thread tt2 = new Thread(ft2, "Two");
		tt1.start();
		tt2.start();
		try {
			tt1.join();
			tt2.join();
		} catch (Exception e) {
		}
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " " + i);
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}