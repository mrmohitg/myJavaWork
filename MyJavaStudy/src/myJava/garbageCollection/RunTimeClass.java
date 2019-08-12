package myJava.garbageCollection;

//This is the example of Runtime Class which is showing that total memory and free memory of the JVMd
class RunTimeClass {
	void show() {
		System.out.println("Hello this is mohit");
	}

	public static void main(String[] args) {
		new RunTimeClass().show();
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory is " + r.totalMemory());
		System.out.println("Free Memory is " + r.freeMemory());
	}
}
/*
 * Output Hello this is mohit Total Memory is 96468992 Free Memory is 94958840
 */