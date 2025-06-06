package myJava.threading.viaAssociation;

class RunnableDemo implements Runnable {
	public RunnableDemo() {
		Thread T = new Thread(this);
		T.start();
	}

	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("i : " + i);
	}

	public static void main(String args[]) {
		RunnableDemo D = new RunnableDemo();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Main Thread Terminated");
	}
}
