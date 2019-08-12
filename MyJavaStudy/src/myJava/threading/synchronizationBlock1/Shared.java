package myJava.threading.synchronizationBlock1;

class Temp {
	void dilToPagalHai(String s) {
		System.out.println("Starting in dilToPagalHaiMethod" + " " + s);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("Ending from dilToPagalHaiMethod" + " " + s);
	}
}

class Shared {
	int x;
	Temp t = new Temp();

	void show(String s, int a) {
		System.out.println("Starting in method" + s);
		synchronized (t) {
			t.dilToPagalHai(s);
		}
	}
}
