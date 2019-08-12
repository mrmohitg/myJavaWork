package myJava.threading.book;

//To create a thread and run it. Let the class extends Thread or implements Runnable
class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}
	}
}

class FirstThread {
	public static void main(String... s) {
		MyThread obj = new MyThread();
		// Thread t = new Thread(obj);
		obj.start();
	}
}