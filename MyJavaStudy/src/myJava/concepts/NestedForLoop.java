package myJava.concepts;

//To display stars in triangular form - nested for loop
public class NestedForLoop {
	public static void main(String args[]) {
		int r = 5;
		for (int i = 1; i <= r; i++) {
			for (int st = 1; st <= i; st++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
/*
 * Output
 *
 * * * * * * * * * * *
 */