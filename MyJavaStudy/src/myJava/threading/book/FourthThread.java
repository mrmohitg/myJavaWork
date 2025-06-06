package myJava.threading.book;

//Two threads performing two tasks at a time.
class FourThread implements Runnable {
	String str;

	public FourThread(String s) {
		str = s;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str + " " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
}

class FourthThread {
	public static void main(String args[]) {
		FourThread obj = new FourThread("Cut the ticket.");
		FourThread obj1 = new FourThread("Show the seat.");
		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj1);
		t.start();
		t1.start();
	}
}