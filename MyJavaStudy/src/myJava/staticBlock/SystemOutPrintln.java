package myJava.staticBlock;

//How the combination System.out.println() is made.
class Temp {
	static Demo d;
	static {
		d = new Demo();
	}
}

class Demo {
	void show(int i) {
		System.out.println("This is how the System.out.println() is made. " + i);
	}
}

class SystemOutPrintln {
	public static void main(String args[]) {
		Temp.d.show(10);
	}
}
/*
 * Output This is how the System.out.println() is made. 10
 */