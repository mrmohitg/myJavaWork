package myJava.staticBlock;

//Static Block in action
import java.io.*;

class StaticBlock {
	static int x;
	static {
		try {
			x = System.in.read();
			System.out.println("Static block is running");
			System.out.println("The ASCII value of the character you have entered is " + x + ".");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String... s) {
		System.out.println("Main function is running");
	}
}
/*
 * Output 2 Static block is running The ASCII value of the character you have
 * entered is 50. Main function is running
 */