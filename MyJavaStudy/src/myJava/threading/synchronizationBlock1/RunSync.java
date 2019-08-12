package myJava.threading.synchronizationBlock1;

class RunSync {
	public static void main(String args[]) {
		Shared st = new Shared();
		CustomeThread t1 = new CustomeThread(st, "One");
		CustomeThread1 t2 = new CustomeThread1(st, "Two");
		CustomeThread2 t3 = new CustomeThread2(st, "Three");
	}
}
