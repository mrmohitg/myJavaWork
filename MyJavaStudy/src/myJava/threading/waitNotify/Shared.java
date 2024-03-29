package myJava.threading.waitNotify;

class Shared {
	int x = 0;
	int flag = 0;

	synchronized void submit() {
		flag = 1;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		x = 1000;
		System.out.println(x);
		notify();
	}

	synchronized void withdraw() {
		try {
			if (flag == 0) {
				wait();
			} else {
				System.out.println(x);
			}
		} catch (Exception e) {
		}
		;
	}
}