package myJava.concepts;

//This program will not execute.
class NoMainFound {
	public void main(String a[]) {
		System.out.println("Main() method is working in good way...");
	}
}
/*
 * Output Error: Main method is not static in class NoMainFound, please define
 * the main method as: public static void main(String[] args)
 */