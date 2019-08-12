package myJava.threading.book;

//To create a thread and run it and then stop it.
class SecThread extends Thread {
	boolean stop = false;

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
			if (stop)
				return;
		}
	}
}

class SecondThread {
	public static void main(String... args) {
		SecThread obj = new SecThread();
		// Thread t= new Thread(obj);
		obj.start();
		try {
			System.in.read();
			obj.stop = true;
		} catch (Exception e) {
		}
	}
}