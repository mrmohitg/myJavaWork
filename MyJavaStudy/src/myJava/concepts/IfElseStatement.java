package myJava.concepts;

//To test if else statement 
public class IfElseStatement {
	public static void main(String args[]) {
		int monthNumber = 5;
		if (monthNumber >= 1 && monthNumber <= 3) {
			System.out.println("You're in Quarter 1.");
		} else if (monthNumber >= 4 && monthNumber <= 6) {
			System.out.println("You're in Quarter 2.");
		} else if (monthNumber >= 7 && monthNumber <= 9) {
			System.out.println("You're in Quarter 3.");
		} else if (monthNumber >= 10 && monthNumber <= 12) {
			System.out.println("You're in Quarter 4.");
		} else
			System.out.println("You entered wrong monthNumber.");
	}
}
/*
 * Output You're in Quarter 2.
 */