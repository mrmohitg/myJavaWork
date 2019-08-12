package myJava.staticBlock;

//DifferentBlocks starting from 'static block', 'init block', 'constructor', 'static method', 'non static method'
public class DifferentBlocks {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Init Block");
	}

	DifferentBlocks() {
		System.out.println("Default Constructor");
	}

	public static void Show() {
		System.out.println("Static Function.");
	}

	public void Display() {
		System.out.println("Instance Function.");
	}

	public static void main(String arr[]) {
		DifferentBlocks obj = new DifferentBlocks();
		Show();
		obj.Display();
	}
}
/*
 * Output Static Block Init Block Default Constructor Static Function. Instance
 * Function.
 */