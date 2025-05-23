package myJava.threading;

class FifthDemo implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println(Thread.currentThread().getName() + " dead");
	}
}

class FifthThread {
	public static void main(String... s) {
		FifthDemo fd1 = new FifthDemo();
		FifthDemo fd2 = new FifthDemo();
		FifthDemo fd3 = new FifthDemo();
		Thread td1 = new Thread(fd1);
		Thread td2 = new Thread(fd2);
		Thread td3 = new Thread(fd3);
		td1.setPriority(Thread.MIN_PRIORITY);
		td3.setPriority(Thread.NORM_PRIORITY);
		td2.setPriority(Thread.MAX_PRIORITY);
		td1.start();
		td2.start();
		td3.start();
		try {
			td1.join();
			td2.join();
			td3.join();
		} catch (Exception e) {
		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				boolean b = td2.isAlive();
				System.out.println("The thread is alive : " + b);
			} catch (Exception e) {
			}
		}
	}
}