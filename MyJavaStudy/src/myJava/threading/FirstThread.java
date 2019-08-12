package myJava.threading;

//This program shows that the main method works on the seprate thread named main thread and we can set it's name.
class FirstThread extends Thread {
	public static void main(String... s) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("Mohit");
		System.out.println(t.getName());
	}
}
